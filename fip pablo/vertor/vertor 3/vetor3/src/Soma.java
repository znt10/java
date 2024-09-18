public class Soma {
    private int numero;

    public void exibir(int soma){

        for(int i =1;i <=10;i++){
            System.out.format("%d * %d = %d\n", soma,i,soma * i);
        }
    }
}
