public class Agenda {
    private int dia ;
    private int mes;
    private int ano;
    private String agendamendo;


    


    public void alteradata(String agendamendo, int dia, int mes, int ano){
        this.validarData(agendamendo, dia, mes, ano);

    }
    private void validarData(String agendamendo, int dia, int mes, int ano){
        if((dia >=1) && (dia<=31) && (mes>=1) && (mes<=12) && (ano >= 2024)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.agendamendo = agendamendo;
            System.out.println("Data valida "+ dia+"/"+ mes+"/"+ano);
    }else{
        System.out.println("data invalida");
    }

    }
    

   

    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;}

    

    public int getAno() {
        return ano;
    }

    public String getAgendamendo() {
        return agendamendo;
    }


}

