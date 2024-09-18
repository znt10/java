
import java.util.ArrayList;



public class Livro {
    private String nomeLivro;
    private Autor autor;
    ArrayList<Livro> livros = new ArrayList<>();

    public Livro(){

    }
    public Livro(String nomeLivro, String nome, String sobrenome){
        this.nomeLivro = nomeLivro;
        this.autor = new Autor(nome, sobrenome);
  
    }



    public void Addlivro(Livro livro){
        this.livros.add(livro);
    }

    public void monstraLivro(){
        for(Livro livro:livros){
            System.out.println(livro.toString());
        }
    }

    public String toString() {
        return "======================="+
        "\nLivro: " + nomeLivro + "\nAutor: " +autor.toString(); 
    }

  
   

}