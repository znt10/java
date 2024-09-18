

public class Agenda {
    private String motivo;
    private int dia;
    private int mes;
    private int ano;
    

    public void validade(int dia, int mes, int ano){
        if((dia >=1) && (dia<=31) && (mes>=1) && (mes<=12) && (ano >= 2024)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            System.out.println("Data validade");

        }else{
            System.out.println("Data invalidade");
        }

}
  


    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

   
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    
    public int getAno() {
        return ano;
    }

   
    public void setAno(int ano) {
        this.ano = ano;
    }

}
