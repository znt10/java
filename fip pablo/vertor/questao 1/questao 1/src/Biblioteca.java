public class Biblioteca {

    private String nome;
    private Livro livro1[];
    



    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivro1() {
        return livro1;
    }

  
    public void setLivro1(Livro[] livro1) {
        this.livro1 = livro1;
    }

    public void exibeLivros(){
        for (int i=0; i<livro1.length; i++){
            System.out.println(livro1[i].getTitulo());
        }
}}