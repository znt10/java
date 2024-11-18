public class Main {
    public static void main(String[] args) {
        Power p = new Power("jose","tigre");
        Power p1 = new Power("bia", "leao");
        Mega m = new Zord();
        p1.Morfa(p,Arma.ESCUDO);
        p.Morfa(p,Arma.ESPADA);
        m.animal(p);
        m.animal(p1);
    }
}