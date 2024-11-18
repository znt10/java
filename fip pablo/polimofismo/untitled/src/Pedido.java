import java.util.Scanner;

public class Pedido{
    private int valor;
    private int quantidade;

    Scanner sc = new Scanner(System.in);

    public Pedido(int valor,int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void Retira(Entregador entregador){
        System.out.println("1 ==Retira na loja Ou 2 ==Entregar");
        int entregar = entregador.valor();
        int  op = sc.nextInt();
        if(op == 1){
            pedido(valor,quantidade);
        }
        else if(op == 2){

            pedido(valor,entregar,quantidade);
            entregador.entregarpedido();


        }

    }

    public void pedido(int va, int valorentraga, int quantidade) {
        System.out.println("Pedido Com Entrega " + ((va * quantidade) + valorentraga));
    }

    public void pedido(int va,int quantidade) {
        System.out.println("Pedido Sem Entrega Fica "+(va * quantidade));
    }


}
