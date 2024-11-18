public class Cliente extends Pessoa {
    private int codigo;



    public Cliente(int codigo,String nome, String cpf) {
        super(nome,cpf);
        this.codigo = codigo;

    }

    public void mostraDados(){
        System.out.println("nome; " + nome);
        System.out.println("cpf; " + cpf);
        System.out.println("codigo; "+codigo);
    }


    
        


    }
