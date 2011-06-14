/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author bestoff
 */
@Entity(name="hospital")
public class Hospital extends BaseEntity{

    private String nome;

    
    public Hospital() {
    }
    
    
}
