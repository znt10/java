public class Pokemon {
    private String nome;
    private String nivel;
    private String habilidade;
    private String genero;
    


    public Pokemon(String nome, String nivel, String habilidade, String genero) {
        this.nome = nome;
        this.nivel = nivel;
        this.habilidade = habilidade;
        this.genero = genero;
    }
    
public String toString(){
return  nome+
"\nNivel: " +nivel;

}
}
