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


public class Utenti_Registrati {
    
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String data_nascita;
    private String password;
    private String img;
    private String presentazione; /* Frase di presentazione */

    public Utenti_Registrati() {
            id = 0;
            nome = "";
            cognome = "";
            email = "";
            password = "";
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param Cognome
     */
    public void setCognome(String Cognome) {
        this.cognome = Cognome;
    }

        /**
     * @return the data_nascita
     */
    public String getData() {
        return data_nascita;
    }

    /**
     * @param data the 
     */
    public void setData(String data) {
        this.data_nascita = data;
    }
    
    /**
     * @return the email
     */
    public String getMail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setMail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    


    /**
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return the presentazione
     */
    public String getPresentazione() {
        return presentazione;
    }

    /**
     * @param presentazione the presentazione to set
     */
    public void setPresentazione(String presentazione) {
        this.presentazione = presentazione;
    }
    
    @Override
    public boolean equals(Object altroUtenti_registrati) {
        if (altroUtenti_registrati instanceof Utenti_Registrati)
            if (this.getId() == ((Utenti_Registrati)altroUtenti_registrati).getId()) return true;
        return false;
    }
}
