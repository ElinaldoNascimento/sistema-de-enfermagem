/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.model;

import br.com.cet.sistenfer.dominio.Clinica;
import br.com.cet.sistenfer.persistence.DaoClinica;
import java.util.List;

/**
 *
 * @author bestoff
 */
public class ModelClinica {
    
    private DaoClinica daoClinica = new DaoClinica();
    private List<Clinica> listagem = null;
    
    public void salvar(Clinica clinica){
        
        daoClinica.salvar(clinica);
    }
    
      public List<Clinica> getListTodos(){
        
        if(listagem==null){
            
            atualizarListagem();
        }
        
        return listagem;
    }
    
    public void atualizarListagem(){
        
        listagem = daoClinica.listTodos();
    }
}
