import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    

    Scanner sc = new Scanner(System.in);
    Pessoa p1 = new Pessoa();
    System.out.println("digite seu nome e cpf");
    p1.nome = sc.nextLine();
    p1.cpf = sc.nextInt();
    p1.exibir();

    sc.nextLine();

    //Pessoa p2 = new Pessoa();
    //System.out.println("digite seu nome e cpf");
    //p2.nome = sc.nextLine();
    //p2.cpf = sc.nextInt();
    //p2.exibir();

        

    Login l1 = new Login();
    System.out.println("coloque a senha");
    int senha = sc.nextInt();
    do{
        System.out.println("Senha incorreta");
        senha = sc.nextInt();
    } while(l1.validar(senha) != true); 

    

}
}