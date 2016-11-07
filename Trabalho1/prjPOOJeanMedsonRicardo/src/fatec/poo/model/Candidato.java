/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.model;

import java.util.ArrayList;


/**
 *
 * @author Jean
 */
public class Candidato extends Pessoa{
    private String inscricao;
    private double media;
    private ArrayList<Prova> provas;

    public Candidato(String cpf, String nome, String endereco) {
        super(cpf, nome, endereco);
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }
 
    public void calcularMedia(){
        double peso=0;
        for(Prova prova: provas){
            this.media += (prova.getNota() * prova.getPeso());
            peso += prova.getPeso();
        }
        this.media = this.media/peso;
    }

    public Double getMedia() {
        return media;
    }

    public ArrayList<Prova> getProvas() {
        return provas;
    }
    
    public void addProva(Prova prova) {
        prova.setCandidato(this);
        provas.add(prova);
    }
    
    
}
