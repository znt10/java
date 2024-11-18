
public class App {
    public static void main(String[] args) throws Exception {
        CadastroPessoa pessoa = new CadastroPessoa(3);

        Funcionario f1 = new Funcionario("323231", 1412, "jose", "02392");
        Cliente c1 = new Cliente(309, "bia", "123434343");
        Gerente g1 = new Gerente("232232332", 3000, "neto", "2211", "vendas");

        pessoa.mostraCadastro(g1);
        pessoa.mostraCadastro(c1);
        pessoa.mostraCadastro(f1);

        pessoa.mostraDados();

    }
}
