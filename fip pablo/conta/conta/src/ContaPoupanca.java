public class ContaPoupanca extends Conta{
    private double cretido = 0.005022;
    private int meses;


    public ContaPoupanca(int num, double salto, int meses){
        super(num,salto);
        this.meses = meses;

    }
    
    public void depositar(double valor){
        super.salto += valor;
        
    }
    public void tempoCaixa(){
        double juros =  meses * (cretido * salto);
        super.salto += juros;
    } 

    public double sacar(double valor){
        super.salto -= valor ;
        return super.salto; 
    }
}
