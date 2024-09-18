
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
  

     Notas[] notas = new Notas[4];
     notas[0] = new Notas(9);
     notas[1] = new Notas(10);
     notas[2] = new Notas(4);
     notas[3] = new Notas(7);
     
     Aluno[] alunos = new Aluno[2];
     alunos[0] = new Aluno("jose",new Notas[]{notas[0],notas[1]});
     alunos[1] = new Aluno("ana", new Notas[]{notas[2],notas[3]});
      

    Professor p1 = new Professor("pablo");



     Disiplina disiplinas = new Disiplina(p1,alunos);
     disiplinas.setMateria("POO");
 
     System.out.println("Professor: "+ p1.toString());

    System.out.println("Disiplina: "+ disiplinas.getMateria());
    System.out.println("Alunos: ");


    disiplinas.exibirAlunos();

    

    }
}
