public class EntregadorMoto extends Entregador{

    public EntregadorMoto(String nome) {
        super(nome);
    }

    public void entregarpedido(){
        super.entregarpedido();
        System.out.println("O entregador "+ super.nome);
        System.out.println("Seu pedido esta indo de Moto");

    }

    public int valor(){
        return 5;

    }

}
