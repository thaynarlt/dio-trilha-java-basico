public abstract class Conta {

    private static Conta instancia;

    protected Conta(String agencia, int numero, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public static Conta getInstancia() {
        if (instancia == null) {
            instancia = new ContaImpl("001", 123456789, "João da Silva", 1000.00);
        }

        return instancia;
    }

    protected String agencia;
    protected int numero;
    protected String nomeCliente;
    protected double saldo;

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public abstract void transferir(double valor, Conta contaDestino);

    public abstract String toString();
}
