/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NerdBook_package;
/*
import NerdBook_package.Utenti_Registrati;
import NerdBook_package.Utenti_RegistratiFactory;    */
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
public class Utenti_RegistratiFactory {
    
    //Pattern Design Singleton
    private static Utenti_RegistratiFactory singleton;

    public static Utenti_RegistratiFactory  getInstance() {
        if (singleton == null) {
            singleton = new Utenti_RegistratiFactory();
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
    
   /* private ArrayList<Utenti_Registrati> listaUtenti_Registrati = new ArrayList<Utenti_Registrati>();

    private Utenti_RegistratiFactory() {
        //Creazione utenti

        //Rufi
        Utenti_Registrati user1 = new Utenti_Registrati();
        user1.setId(0);
        user1.setNome("Rufi");
        user1.setMail("djannigatto@gmail.com");
        user1.setCognome("gatto");
        user1.setPassword("123");
        user1.setImg("img/167654_149070858481920_148641161858223_267054_8188355_n-150x150.jpg");

        //sangie
        Utenti_Registrati user2 = new Utenti_Registrati();
        user2.setId(0);
        user2.setNome("sangie");
        user2.setMail("sangie@gmail.com");
        user2.setCognome("gatto");
        user2.setPassword("123");
        user2.setImg("img/167654_149070858481920_148641161858223_267054_8188355_n-150x150.jpg");

        //goku
        Utenti_Registrati user3 = new Utenti_Registrati();
        user3.setId(0);
        user3.setNome("goku");
        user3.setMail("goku@gmail.com");
        user3.setCognome("gatto");
        user3.setPassword("123");
        user3.setImg("img/167654_149070858481920_148641161858223_267054_8188355_n-150x150.jpg");

        //star
        Utenti_Registrati user4 = new Utenti_Registrati();
        user4.setId(0);
        user4.setNome("star");
        user4.setMail("star@gmail.com");
        user4.setCognome("gatto");
        user4.setPassword("123");
        user4.setImg("img/167654_149070858481920_148641161858223_267054_8188355_n-150x150.jpg");

        listaUtenti_Registrati.add(user1);
        listaUtenti_Registrati.add(user2);
        listaUtenti_Registrati.add(user3);
        listaUtenti_Registrati.add(user4);
    }
*/
      private Utenti_RegistratiFactory() {
    }
    public Utenti_Registrati getUtenti_RegistratiById(int id) {
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from utenti"
                    + "where id = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, id);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                Utenti_Registrati current = new Utenti_Registrati();
                current.setId(res.getInt("id"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setData(res.getString("data_nascita"));
                current.setPresentazione(res.getString("presentazione"));
                current.setImg(res.getString("img"));
                current.setMail(res.getString("email"));
                current.setPassword(res.getString("password"));
                /*chiusura connessione*/
                stmt.close();
                conn.close();
                return current;
            }
            /* chiusura connessione*/
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select id from utenti "
                    + "where nome = ? and password = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setString(1, user);
            stmt.setString(2, password);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                int id = res.getInt("id");
                /*chiusura connessione*/
                stmt.close();
                conn.close();
                return id;
            }
           /*chiusura connessione*/
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
       
    public List getUtentiList() {
        List<Utenti_Registrati> lista_utenti = new ArrayList<Utenti_Registrati>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from utenti";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                Utenti_Registrati current = new Utenti_Registrati();
                current.setId(res.getInt("id"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setData(res.getString("data_nascita"));
                current.setPresentazione(res.getString("presentazione"));
                current.setImg(res.getString("img"));
                current.setMail(res.getString("email"));
                current.setPassword(res.getString("password"));
                
                lista_utenti.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista_utenti;
    }
    
    public List getUtentiList(String nome) {
        List<Utenti_Registrati> listaGatti = new ArrayList<Utenti_Registrati>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from utenti where nome like ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setString(1, "%" + nome + "%");
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                Utenti_Registrati current = new Utenti_Registrati();
                current.setId(res.getInt("id"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setData(res.getString("data_nascita"));
                current.setPresentazione(res.getString("presentazione"));
                current.setImg(res.getString("img"));
                current.setMail(res.getString("email"));
                current.setPassword(res.getString("password"));
                
                listaGatti.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaGatti;
    }
    
    
}
