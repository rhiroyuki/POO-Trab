package fatec.poo.model;


public class Prova {
    private String materia;
    private int peso;
    private double nota;
    private int qtdeQuestoes;
    private Questao questoes[];
    private Concurso concurso;
    private Candidato candidato;
    int qtdAdic=0;

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public Concurso getConcurso() {
        return concurso;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }
    
    
    public Prova(String materia, int qtdeQuestoes) {
        this.materia = materia;
        this.qtdeQuestoes = qtdeQuestoes;
        questoes = new Questao[qtdeQuestoes];
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

    public Questao[] getQuestoes() {
        return questoes;
    }
      
    public void addQuestao(Questao q){
        if(qtdAdic < qtdeQuestoes)
            questoes[qtdAdic++]= q;            
    }
    
    public void efetuarCorrecao(){
        for(int i=0; i<qtdeQuestoes;i++){
            if(questoes[i].getResposta() == questoes[i].getAlternativaGabrito()){
                nota++;
            }
        }
    }
    
    
}
