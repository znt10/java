public class Data {
    public static void main(String[] args) throws Exception {
       Agenda a1 = new Agenda();
      

       a1.validade(10,2,2330);
       a1.setDia(18);

       System.out.println("Data: " + a1.getDia() +"/"+ a1.getMes());
    }
}
