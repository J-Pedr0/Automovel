package Classes;

public class Motorista {
    private String nome;
    private int matricula;
    private Carro veiculo;

    public Motorista(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Motorista(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void acelerar() {
        veiculo.acelerar();
    }

    public void acelerar(int limite) {
        veiculo.acelerar(limite);
    }

    public Carro getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Carro veiculo) {
        this.veiculo = veiculo;
    }

    
}
