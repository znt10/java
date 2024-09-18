
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    
    ArrayList<Conta> contas = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }


    



    
    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void contas(Conta conta){
        this.contas.add(conta);
    }
   


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", conta='" + contas + "'" +
            "}";
    }
   

}
