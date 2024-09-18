public class Autor extends Pessoa{
    private String genero;

    public Autor(String genero, String nome ){
        super(nome);
        this.genero = genero;
    }
    

    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    public String toString() {
        return "{" +
            " genero='" + genero + "'" +
            "nome= "+super.nome +"}";
    }

}
