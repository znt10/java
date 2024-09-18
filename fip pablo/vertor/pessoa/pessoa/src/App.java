public class App {
    public static void main(String[] args) throws Exception {
        Leitor l1 = new Leitor("znt", true);
        Autor a1 = new Autor("terror", "jose");

        Livro li = new Livro(a1, "IT a coisa");
        Biblioteca b1 = new Biblioteca();
        b1.addleitor(l1);
        b1.addlivros(li);

        b1.retornaleitores();
        b1.retornalivros();
    }
}