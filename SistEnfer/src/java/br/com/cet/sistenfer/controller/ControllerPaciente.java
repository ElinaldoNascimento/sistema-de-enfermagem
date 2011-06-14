/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.controller;

import br.com.cet.sistenfer.dominio.Paciente;
import br.com.cet.sistenfer.dominio.Telefone;
import br.com.cet.sistenfer.dominio.enums.TipoEscolaridade;
import br.com.cet.sistenfer.dominio.enums.TipoEstadoCivil;
import br.com.cet.sistenfer.dominio.enums.TipoRaca;
import br.com.cet.sistenfer.dominio.enums.TipoSexo;
import br.com.cet.sistenfer.model.ModelPaciente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bestoff
 */
@ManagedBean(name="contrpaciente")
@SessionScoped
public class ControllerPaciente {

    private ModelPaciente modelPaciente = new ModelPaciente();
    private List<Telefone> telefones = new ArrayList<Telefone>();
    private Telefone telefone = new Telefone();
    private Paciente paciente = new Paciente();
    private Paciente pacienteSelecionado = new Paciente();
    private String sexo = new String();
    private String raca = new String();
    private String estado_civil = new String();
    private String escolatidade = new String();
    
    /** Creates a new instance of ControllerPaciente */
    public ControllerPaciente() {
    }
    
    
    public String cadastrarPaciente(){
        
        telefones.add(telefone);
       
        paciente.setTelefones(telefones);
        paciente.setEstadoCivil(TipoEstadoCivil.valueOf(estado_civil));
        paciente.setEscolaridade(TipoEscolaridade.valueOf(escolatidade));
        paciente.setSexo(TipoSexo.valueOf(sexo));
        paciente.setRaca(TipoRaca.valueOf(raca));
        modelPaciente.salvar(paciente);
        paciente = new Paciente();
        sexo = new String();
        
        
        telefone = new Telefone();
        telefones = new ArrayList<Telefone>();
        return "consultar.xhtml";
        
    }
    
    public void addTelefone(){
        
        telefones.add(telefone);
        telefone = new Telefone();
    }
    
    public List<Paciente> getListPacientes(){
        
        return modelPaciente.getListTodos();
    }
    
    public List<String> getListSexo(){
        
        ArrayList<String> listTipoSexo = new ArrayList<String>();
        TipoSexo[] lista = TipoSexo.values();
        
        for(TipoSexo tiposexo : lista){
            
            listTipoSexo.add(tiposexo.toString());
        }
        
        return listTipoSexo;
    }

    public List<String> getListRaca(){
        
        ArrayList<String> listTipoRaca = new ArrayList<String>();
        TipoRaca[] lista = TipoRaca.values();
        
        for(TipoRaca tipoRaca : lista){
            
            listTipoRaca.add(tipoRaca.toString());
        }
        
        return listTipoRaca;
    }
    
   
    public List<String> getListEstadoCivil(){
        
        ArrayList<String> listEstadoCivil = new ArrayList<String>();
        TipoEstadoCivil[] lista = TipoEstadoCivil.values();
        
        for(TipoEstadoCivil tipoEstadoCivil : lista){
            
            listEstadoCivil.add(tipoEstadoCivil.toString());
        }
        
        return listEstadoCivil;
    }
    
    public List<String> getListEscolaridade(){
        
        ArrayList<String> listEscolaridade = new ArrayList<String>();
        TipoEscolaridade[] lista = TipoEscolaridade.values();
        
        for(TipoEscolaridade escolaridade : lista){
            
            listEscolaridade.add(escolaridade.toString());
        }
        
        return listEscolaridade;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Paciente getPacienteSelecionado() {
        return pacienteSelecionado;
    }

    public void setPacienteSelecionado(Paciente pacienteSelecionado) {
        this.pacienteSelecionado = pacienteSelecionado;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getEscolatidade() {
        return escolatidade;
    }

    public void setEscolatidade(String escolatidade) {
        this.escolatidade = escolatidade;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    
}
