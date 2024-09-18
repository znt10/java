import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Agenda a1 = new Agenda();
        Scanner sc = new Scanner(System.in);
        System.out.println("digite");

        String agen = sc.nextLine();

        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        


        a1.alteradata(agen, dia, mes, ano);
        String f = sc.nextLine();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        a1.alteradata(f, d, m, a);
        
    
    



    }

}

