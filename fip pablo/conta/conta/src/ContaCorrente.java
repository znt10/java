public class ContaCorrente extends Conta{

        public ContaCorrente(int numero, double salto){
            super(numero, salto);
        }
        
        public void depositar(double valor){
            super.salto += valor;
        }

        public void sacar(double valor){
            super.salto -= valor;
        }
    
    
}
