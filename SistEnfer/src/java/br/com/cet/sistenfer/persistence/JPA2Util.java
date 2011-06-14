/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bestoff
 */
public class JPA2Util {
    
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("SistEnferPU");
    
    
    public EntityManager getEntityManager(){
        
        return emf.createEntityManager();
    }
    
    
}
