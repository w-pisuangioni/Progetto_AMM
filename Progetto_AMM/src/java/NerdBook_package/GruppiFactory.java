/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NerdBook_package;

/**
 *
 * @author pisuw
 */
public class GruppiFactory {
    
    /* INIZIO GESTIONE DATABASE */
    private String connectionString;
    
    public void setConnectionString(String s){
        this.connectionString=s;
    }
    
    public String getConnectionString(){
        return this.connectionString;
    }
    
    /* FINE GESTIONE DATABASE */
}
