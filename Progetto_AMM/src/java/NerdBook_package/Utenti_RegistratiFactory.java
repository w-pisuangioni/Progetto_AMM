/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NerdBook_package;

/*import NerdBook_package.Utenti_registrati;*/

import java.util.ArrayList;

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

    private ArrayList<Utenti_Registrati> listaUtenti_Registrati = new ArrayList<Utenti_Registrati>();

    private Utenti_RegistratiFactory() {
        //Creazione utenti

        //Djanni
        Utenti_Registrati user1 = new Utenti_Registrati();
        user1.setId(0);
        user1.setNome("Rufi");
        user1.setEmail("djannigatto@gmail.com");
        user1.setCognome("gatto");
        user1.setPassword("123");
        user1.setUrlFotoProfilo("img/167654_149070858481920_148641161858223_267054_8188355_n-150x150.jpg");

        //HeavyBreathing
        Utenti_Registrati user2 = new Utenti_Registrati();
        user2.setId(0);
        user2.setNome("Rufi");
        user2.setEmail("djannigatto@gmail.com");
        user2.setCognome("gatto");
        user2.setPassword("123");
        user2.setUrlFotoProfilo("img/167654_149070858481920_148641161858223_267054_8188355_n-150x150.jpg");

        //GymWorkOut
        Utenti_Registrati user1 = new Utenti_Registrati();
        user1.setId(0);
        user1.setNome("Rufi");
        user1.setEmail("djannigatto@gmail.com");
        user1.setCognome("gatto");
        user1.setPassword("123");
        user1.setUrlFotoProfilo("img/167654_149070858481920_148641161858223_267054_8188355_n-150x150.jpg");

        //ChaoPovery
        Utenti_Registrati user1 = new Utenti_Registrati();
        user1.setId(0);
        user1.setNome("Rufi");
        user1.setEmail("djannigatto@gmail.com");
        user1.setCognome("gatto");
        user1.setPassword("123");
        user1.setUrlFotoProfilo("img/167654_149070858481920_148641161858223_267054_8188355_n-150x150.jpg");

        listaUtenti_Registrati.add(user1);
        listaUtenti_Registrati.add(user2);
        listaUtenti_Registrati.add(user3);
        listaUtenti_Registrati.add(user4);
    }

    public Utenti_Registrati getUtenti_RegistratiById(int id) {
        for (Utenti_Registrati user : this.listaUtenti_Registrati) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        for(Utenti_Registrati user : this.listaUtenti_Registrati){
            if(user.getNome().equals(user) && user.getPassword().equals(password)){
                return user.getId();
            }
        }
        return -1;
    }
}
