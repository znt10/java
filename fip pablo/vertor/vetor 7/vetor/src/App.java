import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       Livro b1 = new Livro();
       
       System.out.println("Quantos livros que colocar na biblioteca");

       int q = sc.nextInt();
       sc.nextLine();
       for(int i =0; i < q;i++){
        System.out.println("Nome do livros");
        String nome = sc.nextLine();
     
        System.out.println("nome do autor");
        String nomeautor = sc.nextLine();
        System.out.println("Sobrenome");
        String sobrenome = sc.nextLine();

        Livro l1 = new Livro(nome, nomeautor, sobrenome);
        b1.Addlivro(l1);
       }
       b1.monstraLivro();
        


    }
}
