package fatec.poo.model;

import java.util.ArrayList;

public class Prova {
    private String materia;
    private int peso;
    private double nota;
    private int qtdeQuestoes;
    private ArrayList<Questao> questoes;
    private Concurso concurso;

    public Concurso getConcurso() {
        return concurso;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }
    
    
    public Prova(String materia, int qtdeQuestoes) {
        this.materia = materia;
        this.qtdeQuestoes = qtdeQuestoes;
        questoes = new ArrayList<>(qtdeQuestoes);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getNota() {
        return nota;
    }

    public int getQtdeQuestoes() {
        return qtdeQuestoes;
    }

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }
    
    public void addQuestao(Questao q){
        questoes.add(q);
    }
    
    public int efetuarCorrecao(){
        int nota = 0;
        for(int i=0;i<qtdeQuestoes;i++){
            if(questoes.get(i).getResposta() == questoes.get(i).getAlternativaGabrito()){
                nota += 1;
            }
        }
        return(nota);
    }
}
