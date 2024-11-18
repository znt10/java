import java.util.Arraylist;
public class CadastroPessoa {
    private Arraylist<Pessoa> pessoas = new Arraylist<>();
    private int quantidade = 0;



    

        public void mostraCadastro(Pessoa p){
            pessoas.add(p);
        }


        public void mostraDados(){
            for(Pessoa p:pessoas){
                p.mostraDados();
            }



