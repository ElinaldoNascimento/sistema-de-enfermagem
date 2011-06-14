/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.controller;

import br.com.cet.sistenfer.dominio.Clinica;
import br.com.cet.sistenfer.dominio.Enfermaria;
import br.com.cet.sistenfer.dominio.Leito;
import br.com.cet.sistenfer.model.ModelClinica;
import br.com.cet.sistenfer.model.ModelEnfermaria;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bestoff
 */
@ManagedBean(name = "contrclinica")
@SessionScoped
public class ControllerClinica {

    private ModelClinica modelClinica = new ModelClinica();
    private ModelEnfermaria modelEnfermaria = new ModelEnfermaria();
    private Clinica clinica = new Clinica();
    private Clinica clinicaSelecionada = new Clinica();
    private Enfermaria enfermaria = new Enfermaria();
    private List<Enfermaria> enfermarias = new ArrayList<Enfermaria>();
    private List<Leito> leitos = new ArrayList<Leito>();
    private Leito leito = new Leito();

    /** Creates a new instance of ControllerClinica */
    public ControllerClinica() {
    }

    public String cadastrarClinica() {
        
        
        enfermaria.setLeitos(leitos);
        clinica.setEnfermarias(enfermarias);

        modelEnfermaria.salvar(enfermaria);
        modelClinica.salvar(clinica);

        clinica = new Clinica();
        enfermaria = new Enfermaria();
        leito = new Leito();

        return "consultar.xhtml";
    }

    public void addEnfermarias() {

        enfermarias.add(enfermaria);
        enfermaria = new Enfermaria();
    }

    public void addLeitos() {
        
        leitos.add(leito);

        leito = new Leito();
    }

    public List<Clinica> getListClinicas() {

        return modelClinica.getListTodos();
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Clinica getClinicaSelecionada() {
        return clinicaSelecionada;
    }

    public void setClinicaSelecionada(Clinica clinicaSelecionada) {
        this.clinicaSelecionada = clinicaSelecionada;
    }

    public Enfermaria getEnfermaria() {
        return enfermaria;
    }

    public void setEnfermaria(Enfermaria enfermaria) {
        this.enfermaria = enfermaria;
    }

    public List<Enfermaria> getEnfermarias() {
        return enfermarias;
    }

    public void setEnfermarias(List<Enfermaria> enfermarias) {
        this.enfermarias = enfermarias;
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public List<Leito> getLeitos() {
        return leitos;
    }

    public void setLeitos(List<Leito> leitos) {
        this.leitos = leitos;
    }
    
    
}
