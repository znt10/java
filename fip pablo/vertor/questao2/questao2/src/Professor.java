public class Professor {
    private String nome;
    private Disiplina [] disiplinas;
    public Professor(String nome){
        this.nome = nome;
       
    }

    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disiplina[] getDisiplinas() {
        return disiplinas;
    }

    public void setDisiplinas(Disiplina[] disiplinas) {
        this.disiplinas = disiplinas;
    }

    public String toString(){
        return "Professor; "+ nome;
    }
   
}
