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

public class Post {
    
    
    public enum Type {
        TEXT, IMAGE, LINK 
    };

    protected int id;
    protected Utenti_Registrati id_utente;
    protected Gruppi id_gruppo;
    private String contenuto;
    private Type tipoPost;

    public Post() {
        id = 0;
        id_utente = null;
        id_gruppo = null;
        contenuto = "";
        tipoPost = Type.TEXT;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the id_utente
     */
    public Utenti_Registrati getId_utente() {
        return id_utente;
    }

    /**
     * @param id_utente the id_utente to set
     */
    public void setId_utente(Utenti_Registrati id_utente) {
        this.id_utente = id_utente;
    }

    /**
     * @return the id_gruppo
     */
    public Gruppi getId_gruppo() {
        return id_gruppo;
    }

    /**
     * @param id_gruppo the id_gruppo to set
     */
    public void setId_gruppo(Gruppi id_gruppo) {
        this.id_gruppo = id_gruppo;
    }

    /**
     * @return the contenuto
     */
    public String getContenuto() {
        return contenuto;
    }

    /**
     * @param contenuto the contenuto to set
     */
    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    /**
     * @return the tipoPost
     */
    public Type getTipoPost() {
        return tipoPost;
    }

    /**
     * @param tipoPost the tipoPost to set
     */
    public void setTipoPost(Type tipoPost) {
        this.tipoPost = tipoPost;
    }

    
    
}
