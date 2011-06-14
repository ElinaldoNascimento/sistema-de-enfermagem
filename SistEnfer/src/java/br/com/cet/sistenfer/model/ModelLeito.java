/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.model;

import br.com.cet.sistenfer.dominio.Leito;
import br.com.cet.sistenfer.persistence.DaoLeito;
import java.util.List;

/**
 *
 * @author bestoff
 */
public class ModelLeito {
    
    private DaoLeito daoLeito = new DaoLeito();
    private List<Leito> listagem = null;
    
    public void salvar(Leito leito){
        
        daoLeito.salvar(leito);
        
    }
    
    public List<Leito> listTodos(){
        
        if(listagem==null){
            
            atualizarListagem();
        }
        
        return listagem;
                
    }    
    public void atualizarListagem(){
        
        listagem = daoLeito.listTodos();
    }
}
