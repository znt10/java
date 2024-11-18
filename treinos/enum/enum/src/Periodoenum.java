public enum Periodoenum {
    MANHA(3),
    TARDE(2),
    NOITE(1);
    private int periodo;
    Periodoenum(int nome){
        this.periodo = nome;
    }

    public int getPeriodo(){
        return this.periodo;
    }
}
