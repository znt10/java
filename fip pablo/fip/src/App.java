import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);


    Senha s1 = new Senha();
    System.out.println("Coloque a senha");
    int senha = sc.nextInt();
    while(s1.validar(senha) != true){
        System.out.println("Senha errada");
        senha = sc.nextInt();
    }
    System.out.println("Coloque seu nome e idade");
    sc.nextLine();
    Pessoa p1 = new Pessoa();
   
    p1.nome = sc.nextLine();
    p1.idade = sc.nextInt();
    
    while(p1.valor(p1.idade) != true){
        System.out.println("Nao esta apto pra votar");
        switch 
        
    }
    System.out.println("Esta apto pra votar"); 
    


    }
}
