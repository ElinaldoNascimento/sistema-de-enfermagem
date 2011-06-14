/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.model;

import br.com.cet.sistenfer.persistence.DaoPaciente;
import br.com.cet.sistenfer.dominio.Paciente;
import java.util.List;

/**
 *
 * @author bestoff
 */
public class ModelPaciente {
    
    private DaoPaciente daoPaciente = new DaoPaciente();
    private List<Paciente> listagem = null;
   
    
    public void salvar(Paciente paciente){
        
        daoPaciente.salvar(paciente);
    }
   
    
    public List<Paciente> getListTodos(){
        
        if(listagem==null){
            
            atualizarListagem();
        }
        
        return listagem;
    }
    
    public void atualizarListagem(){
        
        listagem = daoPaciente.listTodos();
    }
}
