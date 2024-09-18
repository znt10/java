
public class Mul {
    private int numero;

   
     
    public  void exibir(int op, int nu1, int nu2){
        int resultado;
        switch(op){
            case 1:
            resultado = nu1 * nu2;
            System.out.println(resultado);
            break;
            
            case 2:
            if(nu2 == 0){
                System.out.println("ERRO");
                
            }else{
            resultado = nu1 / nu2;
            System.out.println(resultado);
            }
            break;
            case 3:
            resultado = nu1 - nu2;
            System.out.println(resultado);
            break;
            default:
            System.out.println("operaçao invalida");

            
        }


    
}
}
   
