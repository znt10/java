import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Soma s1 = new Soma();
        Soma s2 = new Soma();
        s1.numero = sc.nextInt();
        s2.numero = sc.nextInt();

        s1.exibir(s1.numero,s2.numero);

    
    }
    }

