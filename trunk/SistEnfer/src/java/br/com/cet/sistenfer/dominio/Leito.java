/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.dominio;

import javax.persistence.Entity;

/**
 *
 * @author bestoff
 */
@Entity(name="leito")
public class Leito extends BaseEntity{
    
    private String descricao;
    private String num;

    public Leito() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
