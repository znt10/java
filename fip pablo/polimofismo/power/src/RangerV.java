public class RangerV extends Ranger{

    public RangerV(String nome) {
        super(nome);
    }

    @Override
    public void morfar() {
        System.out.println("Vermelho morfou");
    }

    @Override
    public void morfar(String armadura) {
        System.out.println("Vermelho morfou com " + armadura);
    }

    @Override
    public void morfar(String armadura, String arma) {
        System.out.println("Vermelhor morfou com " + armadura +" e "+ arma);
    }
}
