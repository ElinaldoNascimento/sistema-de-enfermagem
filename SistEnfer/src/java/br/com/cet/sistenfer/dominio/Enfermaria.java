/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author bestoff
 */
@Entity(name="enfermaria")
public class Enfermaria extends BaseEntity{

    private String nome;
    @OneToMany(cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    @JoinColumn(name="enfermaria")
    private List<Leito> leitos = new ArrayList<Leito>();
    
    public Enfermaria() {
    }

    public List<Leito> getLeitos() {
        return leitos;
    }

    public void setLeitos(List<Leito> leitos) {
        this.leitos = leitos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
