import java.util.ArrayList;

public class Megazord {
    private ArrayList<Zord> zods = new ArrayList<>();


    public void add(Zord zord) {
        zods.add(zord);
    }

    public void mostra(){
        for(Zord z : zods){
        System.out.println("O Zord "+ z);
    }}


}
