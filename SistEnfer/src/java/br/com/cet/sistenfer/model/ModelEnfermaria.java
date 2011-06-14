/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.model;

import br.com.cet.sistenfer.dominio.Enfermaria;
import br.com.cet.sistenfer.persistence.DaoEnfermaria;
import java.util.List;

/**
 *
 * @author bestoff
 */
public class ModelEnfermaria {
    
    private DaoEnfermaria daoEnfermaria = new DaoEnfermaria();
    private List<Enfermaria> listagem = null;
    
    public void salvar(Enfermaria enfermaria){
        
        daoEnfermaria.salvar(enfermaria);
    }
    
    public List<Enfermaria> listTodos(){
        
        if(listagem==null){
            atualizarListagem();
        }
        
        return listagem;
    }
    
    public void atualizarListagem(){
        
        listagem = daoEnfermaria.listTodos();
    }
}
