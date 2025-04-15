import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int primeiroValor = scanner.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int segundoValor = scanner.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int terceiroValor = scanner.nextInt();
		
		
		int soma = primeiroValor + segundoValor;
		
		
		if (soma > terceiroValor) {
			System.out.println("A somas do Primeiro e do Segundo valor é MAIOR a o Terceiro valor");
		} else if (soma < terceiroValor) {
			System.out.println("A somas do Primeiro e do Segundo valor é MENOR a o Terceiro valor");
		} else {
			System.out.println("A somas do Primeiro e do Segundo valor é IGUAL a o Terceiro valor");
			
		}
		
		scanner.close();
	}

}
