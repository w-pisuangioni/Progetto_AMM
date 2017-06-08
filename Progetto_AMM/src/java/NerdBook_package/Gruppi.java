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


public class Gruppi {
    
    private int id;
    private String nome;
    private int creatore;

    
        public Gruppi() {
            id = 0;
            nome = "";
            creatore = 0;

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
     * @return the creatore
     */
    public int getCreatore() {
        return creatore;
    }

    /**
     * @param creatore the creatore to set
     */
    public void setCreatore(int creatore) {
        this.creatore = creatore;
    }

      @Override
    public boolean equals(Object altroGruppo) {
        if (altroGruppo instanceof Gruppi)
            if (this.getId() == ((Gruppi)altroGruppo).getId()) return true;
        return false;
    }    
}
