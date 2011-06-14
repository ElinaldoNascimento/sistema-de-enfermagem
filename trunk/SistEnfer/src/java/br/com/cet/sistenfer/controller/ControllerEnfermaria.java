/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.controller;

import br.com.cet.sistenfer.dominio.Enfermaria;
import br.com.cet.sistenfer.model.ModelEnfermaria;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bestoff
 */
@ManagedBean(name="contrenfermaria")
@SessionScoped
public class ControllerEnfermaria {

    private ModelEnfermaria modelEnfermaria = new ModelEnfermaria();
    private Enfermaria enfermaria = new Enfermaria();
    private Enfermaria enfermariaSelecionada = new Enfermaria();
    /** Creates a new instance of ControllerEnfermaria */
    public ControllerEnfermaria() {
    }

    
    public List<Enfermaria> getListEnfermaria(){
        
        return modelEnfermaria.listTodos();
    }
    
    public Enfermaria getEnfermaria() {
        return enfermaria;
    }

    public void setEnfermaria(Enfermaria enfermaria) {
        this.enfermaria = enfermaria;
    }

    public Enfermaria getEnfermariaSelecionada() {
        return enfermariaSelecionada;
    }

    public void setEnfermariaSelecionada(Enfermaria enfermariaSelecionada) {
        this.enfermariaSelecionada = enfermariaSelecionada;
    }

    
}
