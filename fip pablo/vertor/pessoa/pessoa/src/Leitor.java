public class Leitor extends Pessoa {
    private boolean socio = false;


    public Leitor(String nome,boolean socio) {
        super(nome);
        this.socio = socio;
    }
    

  
    public boolean isSocio() {
        return socio;
    }

  
    public void setSocio(boolean socio) {
        this.socio = socio;
    }


    
    public String toString() {
        return "{" +
            " socio='" + socio + "'" +
            "}";
    }

}
