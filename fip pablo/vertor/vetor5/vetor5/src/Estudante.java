public class Estudante {
    private String nome;
    private int idade;
    private int nota;

    public  String toString(){
        return "Estudante{nome = " + nome + ", idade = "+ idade +", nota = " +  nota+ "}";


    }

    public void mostrarNota(String nome, int idade, int nota){
        this.exibirNota(nome, idade, nota);
    }

    private  void exibirNota(String nome, int idade, int nota){
        this.idade = idade;
        this.nome = nome;
        this.nota = nota;
        if(nota > 10){
            System.out.println("ERRO na nota");
        }else if(nota >= 7){
            System.out.println("O aluno "+ nome +" com "+idade+" de idade passou com "+ nota);
        }else{
            System.out.println("O aluno "+ nome +" com "+idade+" de idade reprovou com "+ nota);
        }
    }
    



    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getIdade() {
        return idade;
    }

   
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
