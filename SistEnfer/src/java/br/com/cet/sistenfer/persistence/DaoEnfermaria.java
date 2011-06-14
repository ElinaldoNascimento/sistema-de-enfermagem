/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.persistence;

import br.com.cet.sistenfer.dominio.Enfermaria;

/**
 *
 * @author bestoff
 */
public class DaoEnfermaria extends GenericDao<Enfermaria> implements BaseDao<Enfermaria> {

    @Override
    protected Class<Enfermaria> getClassDominio() {
        return Enfermaria.class;
    }
    
}
