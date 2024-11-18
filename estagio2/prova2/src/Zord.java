import java.util.ArrayList;

public class Zord extends Mega{
    private ArrayList<String> zords = new ArrayList<>();
    @Override
    public void Megazord() {
        numero ++;
        System.out.println(numero + " de animais foi invocado");
    }

    @Override
    public void animal(Power p) {
        zords.add(p.getAnimal());
        for(String z: zords){
            System.out.println("O Power chamou o animal "+ z);
        }

        Megazord();
    }
}
