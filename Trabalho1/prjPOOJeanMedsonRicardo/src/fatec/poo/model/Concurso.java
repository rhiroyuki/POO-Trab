/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.model;

/**
 *
 * @author ricardo
 */
public class Concurso {
    private String sigla;
    private String descricao;
    private String dataRealizacao;
    private double taxaInscricao;

    public Concurso(String sigla, String descricao, String dataRealizacao, double taxaInscricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.dataRealizacao = dataRealizacao;
        this.taxaInscricao = taxaInscricao;
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
