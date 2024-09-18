public class Livro {
    private String titulo;
    private Autor autor;
    private String isbn;

    public Livro(String titulo, String i, String nome, String sobrenome){
        this.titulo = titulo;
        this.autor = new Autor(nome,sobrenome);
        this.isbn = i;
    }
    



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String toString() {
        return 
                "\nISBN='" + isbn + '\'' +
                ",\nTítulo='" + titulo + '\'' +
                ", \nAutor=" + autor +
                "\n";
    }

}
