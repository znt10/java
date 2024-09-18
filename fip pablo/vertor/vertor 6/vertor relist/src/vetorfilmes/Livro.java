package vetorfilmes;
public class Livro {
    private String nomeLivro;
    private Autor autor;

    public Livro(String nomeLivro, String nome, String sobrenome){
        this.nomeLivro = nomeLivro;
        this.autor = new Autor(nome, sobrenome);
  
    }

   
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


   
    public String getNomeLivro() {
        return nomeLivro;
    }

 
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

}
