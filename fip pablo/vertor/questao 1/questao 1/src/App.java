public class App {
    public static void main(String[] args) throws Exception {
        
        Livro l1[] = new Livro[2];
        Biblioteca b1 = new Biblioteca();
        b1.setNome("IFPB");
        
        l1 [0] = new Livro("it a coisa", "978-1503290563","jose", "neto");
        l1 [1] = new Livro("a cabana", "1", "fabio", "neto");
        b1.setLivro1(l1);
        System.out.println(b1.getLivro1()[0].getTitulo());

        b1.exibeLivros();


  
        
        
  




    }
}
