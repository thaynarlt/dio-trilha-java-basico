import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente após nextInt()

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();

        // Fechando o Scanner após o uso
        scanner.close();

        // Exibindo os dados inseridos pelo usuário
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
