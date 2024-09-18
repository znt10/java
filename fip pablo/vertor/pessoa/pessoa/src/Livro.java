public class Livro{

    private Autor autor;
    private String nome;


    public Livro(Autor autor, String nome) {
        this.autor = autor;
        this.nome = nome;
    }


   
    public String toString() {
        return
            " autor='" + autor + "'" +
            ", nome='" + nome + "'" +
            "}";
    }





}