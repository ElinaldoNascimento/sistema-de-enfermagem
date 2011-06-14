/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.persistence;

import br.com.cet.sistenfer.dominio.BaseEntity;
import java.util.List;

/**
 *
 * @author bestoff
 */
public interface BaseDao<T extends BaseEntity> {
    
    void salvar(T entity);
    List<T> listTodos();
}
