package vetorlivros;

import java.util.ArrayList;
public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public void getLivro(){
        for (Livro l:livros){
            System.out.println(l);
        }
    }
    public void setLivro(Livro livros){
        this.livros.add(livros); 
    } 
}

