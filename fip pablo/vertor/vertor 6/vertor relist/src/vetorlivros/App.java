package vetorlivros;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Biblioteca b1 = new Biblioteca();
        int resposta = -1;
        while(resposta != 0 ){
            System.out.println("Quer continuar 1 ? parar 0?");
            resposta = Integer.parseInt(sc.nextLine());
            if(resposta == 1){
                System.out.println("Coloque um livro");
                String nome = sc.nextLine();
                Livro l1 = new Livro(nome);
                b1.setLivro(l1);
            }
            b1.getLivro();
        }

      

   


       



    }
}
