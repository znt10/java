import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int maior = vet[0];
        int menor = vet[0];

        for(int i = 0; i <10;i++){
            System.out.println("digite um numero para posiçao " + i + ":");
            vet[i] = sc.nextInt();}
        for(int j = 0; j <10;j++){
            System.out.println("vetor["+ j +"] = "+ vet[j]);
        
            if(vet[j] > maior){
            maior = vet[j];}
            if(vet[j] == vet[0] ){
                menor = vet[j];

            }else{
                if (vet[j] < menor) {
                    menor = vet[j];
                }
            }
        }
        System.out.println(maior);
        System.out.println(menor);

        
    
        
       
    
    



}
}
