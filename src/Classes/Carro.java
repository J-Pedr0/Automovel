package Classes;

import java.util.InputMismatchException;

public class Carro {
    private String letrasPlaca; 
    private String numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    public Carro(Motorista motorista) {
        this.motorista = motorista;
        motorista.setVeiculo(this);
    }

    public Carro(String placa, int numChassi, Motorista motorista ) {
        this(motorista);
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    public Carro(){}

    public Carro(String placa, int numChassi) {
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    public String getPlaca() {
        if("ERRO!!!".equals(letrasPlaca)) {
            return letrasPlaca;
        }else {
            return letrasPlaca + numerosPlaca;
        }
    }

    public void setPlaca(String placa) {
        if(placa == null) {
            throw new NullPointerException("O valor da placa não pode ser nulo.");
        }

        if(placa.length() != 7) {
            throw new InputMismatchException("A placa deve ter 7 caracteres.");
        }

        if(placa.matches("[A-Z]{3}\\d{4}")) {
            throw new InputMismatchException("A placa deve ser composta por 3 letras e 4 números.");
        }

        this.letrasPlaca = placa.substring(0, 3);
        this.numerosPlaca = placa.substring(3);

    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual++;
    }

    public void acelerar(int limite) {
        for(int i = velocidadeAtual; i < limite; i++){
            acelerar();
        }
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
    
}
