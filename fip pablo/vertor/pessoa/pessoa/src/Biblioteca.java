import java.util.ArrayList;
public class Biblioteca{
    private ArrayList<Leitor> leitores = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();



    public void addlivros(Livro li){
        livros.add(li);
    }
    public void retornalivros(){
        for(Livro l:livros){
            System.out.println(l);
        }
    }

    public void addleitor(Leitor lei){
        leitores.add(lei);
    }
    public void retornaleitores(){
        for(Leitor l:leitores){
            System.out.println(l);
        }
    }

    
}