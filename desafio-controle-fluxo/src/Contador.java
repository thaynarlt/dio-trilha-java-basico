import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt(); //primeiro parâmetro
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt(); //segundo parâmetro
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		terminal.close(); //fechando o terminal
	}
    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i =1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+i);
        }
	}
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem){
    }
}