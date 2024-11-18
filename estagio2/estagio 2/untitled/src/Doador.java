abstract class Doador {
 protected static int quantidadedoacao = 0;

 public abstract void doar();

    public static double getQuantidadedoacao() {
        return quantidadedoacao;
    }
}
