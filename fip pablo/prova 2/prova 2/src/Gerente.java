public class Gerente  extends Funcionario{
    private String area;

    public Gerente(String cpf, double salario, String nome, String matricula, String area) {
        super(cpf, salario ,nome, matricula);
        this.area = area;
    }


        public void mostraDados(){
            super.mostraDados();
            System.out.println("Area: "+area);
        }   

        

   
    
    
}
