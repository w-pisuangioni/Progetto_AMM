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
public class GruppiFactory {
    
    private static GruppiFactory singleton;

    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory ();
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

private GruppiFactory(){}

public Gruppi getGruppoByid(int id){
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from gruppi"
                    + "where id = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, id);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                Gruppi current = new Gruppi();
                current.setId(res.getInt("id"));
                current.setNome(res.getString("nome"));
                current.setCreatore(res.getInt("creatore"));
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

   public List getGruppiList() {
        List<Gruppi> lista_gruppi = new ArrayList<Gruppi>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "Pisu", "amm2017");
            
            String query = 
                      "select * from gruppi";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                Gruppi current = new Gruppi();
                current.setId(res.getInt("id"));
                current.setNome(res.getString("nome"));
                current.setCreatore(res.getInt("creatore"));
                lista_gruppi.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista_gruppi;
    }

/*gestione tabella membri gruppi */
}


