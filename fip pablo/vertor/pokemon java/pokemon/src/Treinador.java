
import java.util.Scanner;

public class Treinador {
    private String nome;
    private int insignas;
    private Pokedex pokedex;
    private Pokebola pokebola;

    public Treinador(String nome, int insignas) {
        this.pokedex = new Pokedex();
        this.nome = nome;
        this.insignas = insignas;
    }


    Scanner sc = new Scanner(System.in);

    public void jogaPokemon(Pokemon p){
        pokebola = new Pokebola();
        System.out.println("deseja 1 captura se nao 2 run");
        int op = sc.nextInt();
        switch(op){
            case 1:
            System.out.println("pokebola foi lancada");
            this.adicinarPokemonTreinador(p);
            System.out.println("\nPokemon "+ p + "\nfoi capturado com sucesso");
            break;

            case 2:
            System.out.println("VC correu da batalha");
            break;
            default:
            System.out.println("Opçao invalida");
        }


    }
    public void adicinarPokemonTreinador(Pokemon p){
        pokedex.adicinarPokemon(p);
    }
    public  void buscaPokemon(Pokemon p){
        pokedex.buscaPokemon(p);
    }

    public String getNome() {
        return nome;
    }


    public int getInsignas() {
        return this.insignas;
    }

    public void setInsignas(int insignas) {
        this.insignas = insignas;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }


   
    public Pokedex getPokedex() {
        return pokedex;
    }

  
    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }

   
    public Pokebola getPokebola() {
        return pokebola;
    }

 
    public void setPokebola(Pokebola pokebola) {
        this.pokebola = pokebola;
    }
    public void exibirPokemon(){
        pokedex.exibirPokemon();
    }

    public String toString(){
        return "O Treinador "+ nome + " tem "+ insignas + " insignas";
    }

}
