public class Power implements Morf{
    private String nome;
    private Arma arma;
    private String animal;

    public Power(String nome, String animal) {
        this.nome = nome;
        this.animal = animal;
    }

    @Override
    public void Morfa(Power nome) {
        System.out.println("O Power range "+nome.getNome()+" morfou");
    }

    public void Morfa(Power nome, Arma arma) {
        System.out.println("O Power range "+ nome.getNome() +" morfou com "+arma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
