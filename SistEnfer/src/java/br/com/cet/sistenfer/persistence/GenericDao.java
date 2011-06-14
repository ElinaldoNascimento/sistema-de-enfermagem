/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.persistence;

import br.com.cet.sistenfer.dominio.BaseEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author bestoff
 */
public abstract class GenericDao<T extends BaseEntity> implements BaseDao<T> {

    protected abstract Class<T> getClassDominio();

    @Override
    public void salvar(T entity) {

        EntityManager em = new JPA2Util().getEntityManager();

        try {

            if (entity.isPersistence()) {
                em.getTransaction().begin();
                em.merge(entity);
                em.getTransaction().commit();

            } else {
                em.getTransaction().begin();
                em.persist(entity);
                em.getTransaction().commit();
            }

        } catch (Exception e) {
            e.getStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List<T> listTodos(){
        
        EntityManager em = new JPA2Util().getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(getClassDominio()));
        
        List lista = em.createQuery(cq).getResultList();
        
        em.close();
        
        return lista;
    }
}
