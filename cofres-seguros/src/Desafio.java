import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return this.senha == confirmacaoSenha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}

public class Desafio {
    public static void main(String[] args) {
        try (// Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in)) {
            String tipoCofre = scanner.nextLine();

            // Implementa a condição necessária para a verificação dos cofres seguros:
            if (tipoCofre.equalsIgnoreCase("digital")) {
                // Se for um Cofre Digital, leia a senha e a confirmação de senha
                int senha = scanner.nextInt();
                int confirmacaoSenha = scanner.nextInt();

                // Crie um Cofre Digital
                CofreDigital cofreDigital = new CofreDigital(senha);

                // Verifique se a senha está correta e imprima as informações do cofre
                if (cofreDigital.validarSenha(confirmacaoSenha)) {
                    System.out.println("Tipo: " + cofreDigital.tipo);
                    System.out.println("Metodo de abertura: " + cofreDigital.metodoAbertura);
                    System.out.println("Cofre aberto!");
                } else {
                    System.out.println("Tipo: " + cofreDigital.tipo);
                    System.out.println("Metodo de abertura: " + cofreDigital.metodoAbertura);
                    System.out.println("Senha incorreta!");
                }
            } else if (tipoCofre.equalsIgnoreCase("fisico")) {
                // Se for um Cofre Físico, crie um Cofre Físico e imprima suas informações
                CofreFisico cofreFisico = new CofreFisico();
                System.out.println("Tipo: " + cofreFisico.tipo);
                System.out.println("Metodo de abertura: " + cofreFisico.metodoAbertura);
            }
        }
    }
}