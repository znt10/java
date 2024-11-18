import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteDelivery {
    private ArrayList<Entregador> entregadores =  new ArrayList<>();
    Entregador e1 = new EntregadorBike("jose");
    Entregador e2 = new EntregadorMoto("joao");
    Scanner sc = new Scanner(System.in);



    public void entregarpedido(){
        for(Entregador e : entregadores){
            e.entregarpedido();
        }
    }
    public void add(Entregador entregador) {
        entregadores.add(entregador);
    }


    public void retirar() {
        System.out.println("Valor do pedido e Quantidade");
        Pedido pedido = new Pedido(sc.nextInt(),sc.nextInt());
        pedido.Retira(e1);
        pedido.Retira(e2);
    }






}
