package vetorlivros;
public class Livro {
    private String nome;
    public Livro(String nome){
    this.nome = nome;}

    

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return nome;
    }

}
