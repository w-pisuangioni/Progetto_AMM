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

import NerdBook_package.Post;
import NerdBook_package.Utenti_Registrati;


public class Gruppi {
    
    private int idgr;
    private String nomegruppo;
    private String data;
    private String password;
    private String urlFoto;
    
        public Gruppi() {
            idgr = 0;
            nomegruppo = "";
            data = "";
            urlFoto = "";
            password = "";
    }    
    
        /**
     * @return the id
     */
        public int getIdgr() {
        return idgr;
        }
    
    /**
     * @param id the id to set
     */
    public void setIdgr(int id) {
        this.idgr = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nomegruppo;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nomegruppo = nome;
    }

        /**
     * @return the data
     */
    public String getdata() {
        return data;
    }

    /**
     * @param data the 
     */
    public void setdata(String data) {
        this.data = data;
    }
    
    @Override
    public boolean equals(Object altroGruppi) {
        if (altroGruppi instanceof Gruppi)
            if (this.getIdgr() == ((Gruppi)altroGruppi).getIdgr()) return true;
        return false;
    }

    /**
     * @return the urlFotoProfilo
     */
    public String getUrlFoto() {
        return urlFoto;
    }

    /**
     * @param urlFoto the urlFotoProfilo to set
     */
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    
      
}
