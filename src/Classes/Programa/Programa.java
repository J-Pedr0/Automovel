package Classes.Programa;


import Classes.Motorista2;

public class Programa {
    public static void main(String[] args) {
        Motorista2 mot = new Motorista2();

        mot.setNome("Leandro");
        mot.setHabilitacao("12345678910");

        System.out.println("Habilitação do motorista %s, %s " + mot.getNome() + mot.getHabilitacao());

    }
}
