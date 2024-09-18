import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Soma s1 = new Soma();
        
        int valor = sc.nextInt();
        int num;
        do{
            System.out.println("coloque o 0 pra continuar");
            num = sc.nextInt();
        }while( num !=0);

        s1.exibir(valor);
        

    }
}
