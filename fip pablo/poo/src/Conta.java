public class Conta {
    private String idioma;
    private String tela;

    public void entra(){

        busca();
        resolucaotela();
    } 
    private void busca(){
        idioma = "PT-BR";
    }

    private void resolucaotela(){
        tela = "Full HD";
    }
    public void assistir(String nomeFilme){
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando filme com de resoluçao" + tela);
        audio();

    }

    private void audio(){
        if(idioma =="PT-BR" || idioma =="EN-US"){
            System.out.println("Carregando o audio em " + idioma);

        }else{
            System.out.println("Carregando o audio em EN-US");
        }

}
}
