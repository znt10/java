public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("jose");
        ContaPoupanca cp = new ContaPoupanca(12221, 1000, 8);
        ContaCorrente cr = new ContaCorrente(123331, 2000);
        cp.depositar(1000);
        cp.tempoCaixa();
        p1.contas(cr);
        p1.contas(cp);
        
        
        

        System.out.println(p1);
    }
}
