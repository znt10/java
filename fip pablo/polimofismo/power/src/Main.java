public class Main {
    public static void main(String[] args) {

      Megazord m = new Megazord();
      RangerAul aul = new RangerAul("jose");
      RangerV v = new RangerV("joa");
      RangerA a = new RangerA("dudu");
      v.morfar("de armadura vermelho");
      a.morfar("de Armadura  amarelho");
      aul.morfar("de Armadura azul");
        System.out.println();
      Zord zordamarelho = new Animal("Falcao",a);
      Zord zordvermelho = new Animal("Pinguim",v);
      Zord zordazul = new Animal("zebra",aul);
      m.add(zordazul);
      m.add(zordvermelho);
      m.add(zordamarelho);
      m.mostra();

    }
}