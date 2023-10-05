package aparelho.telefone;

public class AparelhoTelefonico {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public AparelhoTelefonico(String numero) {
        this.numero = numero;
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazer chamada para: " + numero);
    }

    public void atenderChamada() {
        System.out.println("Atender chamada");
    }

    public void desligarChamada() {
        System.out.println("Desligar chamada");
    }

}

