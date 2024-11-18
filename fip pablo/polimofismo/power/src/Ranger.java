public abstract class Ranger {
    private String nome;

    public Ranger(String nome) {
        this.nome = nome;
    }

    public abstract void morfar();

    public abstract void morfar(String armadura);

    public abstract void morfar(String armadura, String arma);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ranger{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
