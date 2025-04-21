import java.util.Scanner;

public class Exercicio_01vetores {

	public static void main(String[] args) {
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		System.out.println("2, 5, 1, 3, 4, 9, 7, 8, 10, 6");
		System.out.print("Digite um dos números acima para pesquisar: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		boolean encontrado = false;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				System.out.println("Número encontrado na posição: " + i);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Não foi encontrado!");
		}
		scanner.close();
	}

}
