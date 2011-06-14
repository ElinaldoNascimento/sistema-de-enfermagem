/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.dominio;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author bestoff
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BaseEntity)) {
            return false;
        }
        BaseEntity other = (BaseEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cet.sistenfer.dominio.BaseEntity[ id=" + id + " ]";
    }
    
    /**
     * 
     * @return isPersistence este método retorna se uma determinada entidade
     * já existi no banco de dados, testando se o seu id é diferente de null.Caso seja diferente de 
     * Null retorna verdadeiro.
     */
    
    public boolean isPersistence(){
        
        return (id!=null);
    }
    
}
