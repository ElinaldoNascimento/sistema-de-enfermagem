/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.controller;

import br.com.cet.sistenfer.dominio.Leito;
import br.com.cet.sistenfer.model.ModelLeito;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author bestoff
 */
@ManagedBean(name="contrleito")
@RequestScoped
public class ControllerLeito {

    private Leito leito = new Leito();
    private ModelLeito modelLeito = new ModelLeito();
    private Leito leitoSelecioando = new Leito();
    
    /** Creates a new instance of ControllerLeito */
    public ControllerLeito() {
    }
    
    public String cadastroLeito(){
        
        modelLeito.salvar(leito);
        
        leito = new Leito();
        
        return "consultar.xhtml";
    }
    
    public List<Leito> getListLeitos(){
        
        return modelLeito.listTodos();
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public Leito getLeitoSelecioando() {
        return leitoSelecioando;
    }

    public void setLeitoSelecioando(Leito leitoSelecioando) {
        this.leitoSelecioando = leitoSelecioando;
    }
    
    
}
