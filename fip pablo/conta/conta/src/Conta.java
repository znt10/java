

public class Conta{
    private int numero;
    protected double salto;
   


    public Conta(int numero, double salto) {
        this.numero = numero;
        this.salto = salto;
        
    }
    


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

  
    public double getSalto() {
        return salto;
    }

  
    public void setSalto(double salto) {
        this.salto = salto;
    }

    @Override
    public String toString() {
        return String.format(
            "numero='%d', saldo='%.2f'", 
            getNumero(), 
            getSalto());
    }

}