public class Aluno {
    private String nome;
    private Notas[] nota;

    public  Aluno(String nome, Notas[] nota){
        this.nome = nome;
        this.nota = nota;
    }

  
    

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Notas []getNotas() {
        return nota;
    }

    public void setNotas(Notas[]notas) {
        this.nota = notas;
    }

    public String toString(){
        return nome;
    }

}
