/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author ricardo
 */
public class Concurso {
    private String sigla;
    private String descricao;
    private String dataRealizacao;
    private double taxaInscricao;
    private ArrayList<Prova> provas;
    private ArrayList<Pessoa> pessoas;

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void addPessoa(Pessoa pessoa) {
        pessoa.setConcurso(this);
        pessoas.add(pessoa);
    }

    public Concurso(String sigla, String descricao, String dataRealizacao) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.dataRealizacao = dataRealizacao;
        this.provas = new ArrayList<Prova>();
    }

    public ArrayList<Prova> getProvas() {
        return provas;
    }

    public void addProva(Prova prova) {
        prova.setConcurso(this);
        provas.add(prova);
    }

    public void setTaxaInscricao(double taxaInscricao) {
        this.taxaInscricao = taxaInscricao;
    }
    
    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public double getTaxaInscricao() {
        return taxaInscricao;
    }
    
}
