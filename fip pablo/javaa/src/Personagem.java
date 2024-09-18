
import java.util.Random;

public class Personagem {
    String nome;
    
    int nivel;
    int forca;

    void mostrarsStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d força\n", nome, nivel,forca);

    }
    int calcular(){
        Random gerador  = new Random();
        int dado20 = 1 + gerador.nextInt(19);
        int dano = forca + dado20;
        return dano;

    }

    void atacar(String alvo, String golpe){
        int danocausado = calcular();
        if(golpe.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano\n", nome, alvo, danocausado);
        }else{
            System.out.format("%s usou '%s'e  %s e causou %d de dano\n", nome,golpe, alvo, danocausado);
        }
    }
}
