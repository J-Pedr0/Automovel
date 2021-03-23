package Classes.Programa;

import Classes.Carro;
import Classes.Motorista;

public class ProgramaCarro6 {
    public static void main(String[] args) {
        Motorista mot = new Motorista("Leandro", 123456);
        Carro car = new Carro("ABC1234", 456789123, mot);

        System.out.println();
        System.out.println("PASSAGEIRO: Motorista, acelera o carro até 100km/h!!");
        System.out.println("MOTORISTA: Ok, vamos lá!");
        mot.acelerar(100);

        /*

        mot.acelerar(100); também resolveria, devido ao modelo de referência de
        memória que já estudamos anteriormentente 

        */

        System.out.println("Velocidade do carro: %s km/h" + car.getVelocidadeAtual());
    }
    
}