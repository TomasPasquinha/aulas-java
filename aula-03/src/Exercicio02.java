import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Número PAR ");
		}else {
			System.out.println("Número ÍMPAR");
		}
		if (numero >= 0) {
			System.out.println("Número POSITIVO");
		}else {
			System.out.println("Numero NEGATIVO");
		}
		

		scanner.close();
	}

}
