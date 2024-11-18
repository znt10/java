public class RangerA extends Ranger{
    public RangerA(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println("Amarelo Morfou");
    }

    @Override
    public void morfar(String armadura) {
        System.out.println("Amarelo Morfou com " + armadura);
    }

    @Override
    public void morfar(String armadura, String arma) {
        System.out.println("Morfou com " + armadura + " " + arma);

    }
}
