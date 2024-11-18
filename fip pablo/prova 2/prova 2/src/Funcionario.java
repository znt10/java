public class Funcionario extends Pessoa {
   
    private String matricula;
    protected double salario;

     public Funcionario(String matricula, double salario,String nome, String cpf) {
        super(nome, cpf);
        this.matricula  = matricula;
        this.salario = salario;
        
    }

    public void mostraDados(){
        super.mostraDados(); 
        System.out.println("matricula: "+ matricula);
        System.out.println("salario: " + salario);
    }



  


  

}
