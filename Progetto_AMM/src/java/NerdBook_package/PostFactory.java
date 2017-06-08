/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NerdBook_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pisuw
 */
public class PostFactory {
    
    private static PostFactory singleton;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory ();
        }
        return singleton;
    }
    
    
    /* INIZIO GESTIONE DATABASE */
    private String connectionString;
    
    public void setConnectionString(String s){
        this.connectionString=s;
    }
    
    public String getConnectionString(){
        return this.connectionString;
    }
    
    /* FINE GESTIONE DATABASE */
    private PostFactory(){}

        public Post getPostById(int id) {        
        Utenti_RegistratiFactory utenteFactory = Utenti_RegistratiFactory.getInstance();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from posts "
                    + "join tipipost on posts.tipo_post = tipipost.id "
                    + "where id = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, id);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                Post current = new Post();
                //imposto id del post
                current.setId(res.getInt("id"));
                
                //impost il contenuto del post
                current.setContenuto(res.getString("contenuto"));
                
                //imposto il tipo del post
                current.setTipoPost(this.postTypeFromString(res.getString("tipoPost")));
                
                //imposto l'autore del post
                Utenti_Registrati autore = utenteFactory.getUtenti_RegistratiById(res.getInt("id_utente"));
                
                current.setId_utente(autore);
               
                stmt.close();
                conn.close();
                return current;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
    }

        public Post getPostByIdGroup(int id) {        
        GruppiFactory gruppoFactory = GruppiFactory.getInstance();
        Utenti_RegistratiFactory utenteFactory = Utenti_RegistratiFactory.getInstance();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from posts "
                    + "join tipipost on posts.tipo_post = tipipost.id "
                    + "where id_gruppo = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, id);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                Post current = new Post();
                //imposto id del post
                current.setId(res.getInt("id"));
                
                //impost il contenuto del post
                current.setContenuto(res.getString("contenuto"));
                
                //imposto il tipo del post
                current.setTipoPost(this.postTypeFromString(res.getString("tipoPost")));
                
                //imposto l'autore del post
                Utenti_Registrati autore = utenteFactory.getUtenti_RegistratiById(res.getInt("id_utente"));
                current.setId_utente(autore);
                
                //imposto il gruppo del post
                Gruppi gruppo = gruppoFactory.getGruppoByid(res.getInt("id_gruppo"));
                current.setId_gruppo(gruppo);
               
                stmt.close();
                conn.close();
                return current;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
    } 
        
        public Post getPostByIdUser(int id) {        
        Utenti_RegistratiFactory utenteFactory = Utenti_RegistratiFactory.getInstance();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from posts "
                    + "join tipipost on posts.tipo_post = tipipost.id "
                    + "where id_utente = ? and id_gruppo = 0";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, id);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                Post current = new Post();
                //imposto id del post
                current.setId(res.getInt("id"));
                
                //impost il contenuto del post
                current.setContenuto(res.getString("contenuto"));
                
                //imposto il tipo del post
                current.setTipoPost(this.postTypeFromString(res.getString("tipoPost")));
                
                //imposto l'autore del post
                Utenti_Registrati autore = utenteFactory.getUtenti_RegistratiById(res.getInt("id_utente"));
                
                current.setId_utente(autore);
               
                stmt.close();
                conn.close();
                return current;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
    }

        
        
    public List getPostList(Utenti_Registrati utente) {
        List<Post> listaPost = new ArrayList<Post>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from posts "
                    + "join posttype on posts.type = posttype.posttype_id "
                    + "where author = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, utente.getId());
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                
                Post current = new Post();
                //imposto id del post
                current.setId(res.getInt("post_id"));
                
                //impost il contenuto del post
                current.setContenuto(res.getString("content"));
                
                //imposto il tipo del post
                current.setTipoPost(this.postTypeFromString(res.getString("tipoPost")));

                //imposto l'autore del post
                current.setId_utente(utente);
                
                listaPost.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPost;
    }
    
    public void addNewPost(Post post){
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "gato", "gato");
            
            String query = 
                      "insert into posts (post_id, content, type, author) "
                    + "values (default, ? , ? , ? )";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setString(1, post.getContenuto());

            stmt.setInt(2, this.postTypeFromEnum(post.getTipoPost()));
            
            stmt.setInt(3, post.getId_utente().getId());
            
            // Esecuzione query
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
        
    private Post.Type postTypeFromString(String type){
        
        if(type.equals("IMAGE"))
            return Post.Type.IMAGE;
        else 
            if(type.equals("LINK"))
               return Post.Type.LINK;
            else
               return Post.Type.TEXT;
    }
    
    private int postTypeFromEnum(Post.Type type){
        if(null == type)
            return 4;
            else
            //È realizzabile in modo più robusto rispetto all'hardcoding degli indici
        switch (type) {
            case TEXT:
                return 1;
            case IMAGE:
                return 2;
            case LINK:
                return 3;
            default:
                return 4;
        }
    }
}
