public class Disiplina {

    private Professor prof;
    private Aluno[] alunos;
    private Notas nota;
    private String materia;
    
    public void exibirAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
        
    }

    public Disiplina(Professor prof, Aluno[] alunos){
        
        this.prof = prof;
        this.alunos = alunos;


    }


    

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public Aluno[] getAluno(){
        return alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }

  
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


  


    public Notas getNota() {
        return nota;
    }

    public void setNota(Notas nota) {
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
