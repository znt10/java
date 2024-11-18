public class DoadorEmpresa extends Doador{

    @Override
    public void doar() {
        quantidadedoacao ++;
        System.out.println(quantidadedoacao + " empresas doram pra caridade");
    }
}
