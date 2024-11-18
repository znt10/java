public class RangerAul extends Ranger{

    public RangerAul(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println("Azul Morfou");
    }

    @Override
    public void morfar(String armadura) {
        System.out.println("Azul Morfou com "+armadura);
    }

    @Override
    public void morfar(String armadura, String arma) {
        System.out.println("Azul Morfou com "+armadura +" "+arma);
    }
}
