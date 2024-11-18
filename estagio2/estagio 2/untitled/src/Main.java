public class Main {
    public static void main(String[] args) {
        Doador doador = new DoadorEmpresa();
        Doador doador1 = new DoadorPessoaFisica();
        Teste t = new Teste();
        try {
            t.loop(doador,doador1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}