public class EntregadorBike extends Entregador {


    public EntregadorBike(String nome) {
        super(nome);
    }

    public void entregarpedido(){
        super.entregarpedido();
        System.out.println("O entregador "+ super.nome);
        System.out.println("Seu pedido esta indo de Bike");
    }

    public int valor(){
        return 2;

    }

}
