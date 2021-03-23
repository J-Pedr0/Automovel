package Classes.Programa;

import Classes.Motorista2;
import Classes.Passageiro;

public class Programa2 {
    public static void main(String[] args) {
        Motorista2 mot = new Motorista2();
        Passageiro pas = new Passageiro();

        mot.setNome("Leandro");
        mot.setHabilitacao("12345678910");

        pas.setNome("Leonardo");

        System.out.println("***Passageiro entra no carro...***");
        System.out.println("Motorista: %s\n" + mot.cumprimrntar());
        System.out.println("Passageiro: %s" + pas.cumprimrntar());
    }
}
