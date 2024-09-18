import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Mul m1 = new Mul();
        Mul m2 = new Mul();

        System.out.println("digite dois numero");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
    


        System.out.println("1 MULTIPLICAR OU 2 DIVIDIR OU 3 SUBITRIR");
        int op = sc.nextInt();

        m1.exibir(op, num1, num2);


        
        


     
    }
}
