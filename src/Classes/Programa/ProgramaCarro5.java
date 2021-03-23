package Classes.Programa;

import Classes.Carro;
import Classes.Motorista;

public class ProgramaCarro5 {
    public static void main(String[] args) {
        Carro car = new Carro("ABC1234", 456789123);
        Motorista mot = new Motorista(car);

        System.out.println("PASSAGEIRO: Motorista, acelera o carro até 100km/h!!");
        System.out.println("MOTORISTA: Ok, vamos lá!");
        mot.acelerar(100);

        System.out.println("Velocidade do carro: %s km/h" + car.getVelocidadeAtual());
    }
    
}
