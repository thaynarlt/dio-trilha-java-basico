import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Uso da classe Conta
        Conta conta = Conta.getInstancia();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        conta.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        conta.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        conta.saldo = scanner.nextDouble();

        // Fechando o Scanner após o uso
        scanner.close();

        // Exibindo os dados inseridos pelo usuário
        String mensagem = "Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
