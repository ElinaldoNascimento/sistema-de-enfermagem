/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cet.sistenfer.dominio;

import br.com.cet.sistenfer.dominio.enums.TipoEscolaridade;
import br.com.cet.sistenfer.dominio.enums.TipoEstadoCivil;
import br.com.cet.sistenfer.dominio.enums.TipoRaca;
import br.com.cet.sistenfer.dominio.enums.TipoSexo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bestoff
 */
@Entity(name="pessoa")
public abstract class Pessoa extends BaseEntity{

    private String nome;
    private String sobrenome;
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Enumerated(EnumType.STRING)
    @Column(length=1,name="sexo")
    private TipoSexo sexo;
    @Enumerated(EnumType.STRING)
    @Column(length=40, name="raca")
    private TipoRaca raca;
    @Enumerated(EnumType.STRING)
    @Column(length=40,name="estado_civil")
    private TipoEstadoCivil estadoCivil;
    private String naturalidade;
    private String nacionalidade;
    @Enumerated(EnumType.STRING)
    @Column(name="escolaridade",length=40)
    private TipoEscolaridade escolaridade;
    @OneToMany(cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    @JoinColumn(name="pessoa")
    private List<Telefone> telefones = new ArrayList<Telefone>();
    private String profissao;
    private String procedencia;
    
    public Pessoa() {
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public TipoEstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(TipoEstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoRaca getRaca() {
        return raca;
    }

    public void setRaca(TipoRaca raca) {
        this.raca = raca;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public TipoEscolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(TipoEscolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    
    
    
}
