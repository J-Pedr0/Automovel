package Classes;

public class Passageiro extends Pessoa {
    private String codigoCliente;

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String cumprimrntar() {
        return "Olá, motorista!";
        }

}
