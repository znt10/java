import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      ArrayList<Estudante> estudantes = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      
      int cont = 1;
      while(cont != 0){

      Estudante e1 = new Estudante();
      System.out.println("Coloque seu nome;");
      sc.nextLine();
      String nome = sc.nextLine();

      System.out.println("Digite sua idade;");
      int idade = sc.nextInt();

      System.out.println("Coloque sua nota");
      int nota = sc.nextInt();

      e1.setNome(nome);
      e1.setIdade(idade);
      e1.setNota(nota);
      estudantes.add(e1);


      e1.mostrarNota(nome,idade,nota);
     
      System.out.println("0 Parar 1 continuar;");
      cont = sc.nextInt();
    }

      System.out.println();
      for(Estudante e :estudantes){
        System.out.println(e.toString());
      }

  
    }
}
