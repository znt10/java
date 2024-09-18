public class Notas {
    private int nota;
    public Notas(int nota){
        this.nota = nota;

    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
   }
   public String ToString(){
    return "Notas: "+ nota;
   }

}
