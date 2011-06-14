/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.persistence;

import br.com.cet.sistenfer.dominio.Leito;

/**
 *
 * @author bestoff
 */
public class DaoLeito extends GenericDao<Leito> implements BaseDao<Leito> {

    @Override
    protected Class<Leito> getClassDominio() {
        return Leito.class;
    }
    
}
