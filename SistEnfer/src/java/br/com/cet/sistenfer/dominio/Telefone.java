/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.dominio;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author bestoff
 */
@Entity(name="telefone")
public class Telefone extends BaseEntity{

    private String numero;
    
    public Telefone() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }    
}
