package Classes.Programa;

import java.util.InputMismatchException;

import Classes.Carro;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro(); 

        try {
            carro.setPlaca(null);
        } catch(InputMismatchException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Programa encerrado.");

            return;
        }catch(NullPointerException ex) {
            System.out.println(ex.getMessage());
            System.out.println("O programa continuará com a placa ABC1234.");
            carro.setPlaca("ABC1234");
        }
      
        carro.setNumChassi(120123123);

        System.out.println("Placa do carro cadastrado: " + carro.getPlaca());
    }
}