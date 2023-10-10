public class ContaImpl extends Conta {

    ContaImpl(String agencia, int numero, String nomeCliente, double saldo) {
        super(agencia, numero, nomeCliente, saldo);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia='" + agencia + '\'' +
                ", numero=" + numero +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
