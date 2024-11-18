public class Pessoa {
    protected String nome;
    protected String cpf;


    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }  

    public void mostraDados(){
        System.out.println("nome: "+ nome);
        System.out.println("cpf: "+ cpf); 
    }

    

}
