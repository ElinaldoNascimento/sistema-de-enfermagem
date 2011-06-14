/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.persistence;

import br.com.cet.sistenfer.dominio.Clinica;

/**
 *
 * @author bestoff
 */
public class DaoClinica extends GenericDao<Clinica> implements BaseDao<Clinica> {

    @Override
    protected Class<Clinica> getClassDominio() {
        return Clinica.class;
    }
    
}
