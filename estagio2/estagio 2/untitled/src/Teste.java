import java.util.Random;

public class Teste {

    public void loop(Doador p, Doador e){
        Random r = new Random();
        int o = 0;
        while(o <= 5){
            p.doar();
            e.doar();
            o++;
        }
    }
}
