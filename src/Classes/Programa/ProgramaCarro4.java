package Classes.Programa;

import Classes.Carro;

public class ProgramaCarro4 {
    public static void main(String[] args) {
        Carro car = new Carro("ABC1234", 123456);

        System.out.println("Velocidade do carro: " + car.getVelocidadeAtual());

        System.out.println("Acelerando o carro...");
        for(int i = 0; i < 10; i++) {
            car.acelerar();
        }

        System.out.println("Velocidade do carro: " + car.getVelocidadeAtual());

        System.out.println("ACELERANDO O CARRO ATÉ 50 KM/h...");
        
        System.out.println("Velocidade do carro: " + car.getVelocidadeAtual());

    }
}
