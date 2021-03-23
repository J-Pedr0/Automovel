package Classes.Programa;

import Classes.Carro;

public class ProgramaCarro2 {
    public static void main(String[] args) {
        Carro c1, c2;

        c1 = new Carro();

        c1.setPlaca("ABC1234");
        c1.setNumChassi(123456);

        c2 = c1;

        c2.setPlaca("XYZ5678");

        System.out.println("Placa do carro 1: " + c1.getPlaca());
        System.out.println("Placa do carro 2: " + c2.getPlaca());
    }
}
