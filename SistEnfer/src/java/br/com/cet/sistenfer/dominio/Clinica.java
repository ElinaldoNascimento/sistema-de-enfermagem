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
@Entity(name="clinica")
public class Clinica extends BaseEntity{

    private String nome;
    @OneToMany(cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    @JoinColumn(name="clinica")
    private List<Enfermaria> enfermarias = new ArrayList<Enfermaria>();
    
    
    public Clinica() {
    }

    public List<Enfermaria> getEnfermarias() {
        return enfermarias;
    }

    public void setEnfermarias(List<Enfermaria> enfermarias) {
        this.enfermarias = enfermarias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
 
    
}
