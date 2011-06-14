/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.persistence;

import br.com.cet.sistenfer.dominio.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author bestoff
 */
public class DaoPaciente extends GenericDao<Paciente> implements BaseDao<Paciente> {

    @Override
    protected Class<Paciente> getClassDominio() {
        return Paciente.class;
    }
    
     
    @Override
    public List<Paciente> listTodos() {

        EntityManager em = new JPA2Util().getEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Paciente> cq = cb.createQuery(Paciente.class);
        Root<Paciente> paciente = cq.from(Paciente.class);
        cq.select(paciente);
        cq.orderBy(cb.desc(paciente.get("id")));

        List<Paciente> result = em.createQuery(cq).getResultList();

        em.close();
        
        return result;

    }
}
