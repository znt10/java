public class Animal implements Zord{
    private String tipo;
    private Ranger pilodo;

    public Animal(String tipo, Ranger pilodo) {
        this.tipo = tipo;
        this.pilodo = pilodo;
    }

    @Override
    public void pilodo() {
        System.out.println("O Ranger "+ this.pilodo.getNome()+ " chamou o zord "+ this.tipo);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", pilodo=" + pilodo +
                '}';
    }
}
