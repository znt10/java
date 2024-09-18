public class App {
    public static void main(String[] args) throws Exception {
       Pokemon p1 = new Pokemon("pikachu", "4", "eletrico", "macho");
       Treinador t1 = new Treinador("jose", 5);
     
       t1.buscaPokemon(p1);
       System.out.println(t1);
       t1.jogaPokemon(p1);
    
       

    }
}
