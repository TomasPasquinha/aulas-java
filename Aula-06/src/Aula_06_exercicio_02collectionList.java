import java.util.ArrayList;
import java.util.Scanner;

public class Aula_06_exercicio_02collectionList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>(); //Cria a lista de inteiros.

		for (int i = 1; i <= 10; i++) {
			numeros.add(i * 10); //Adiciona múltiplos de 10 de 10 a 100.

		}

		System.out.println("Digite um número inteiro: ");
		int numeroDigitado = scanner.nextInt();
		
		if (numeros.contains(numeroDigitado)) { //Verifica se o número está na lista.

			int posicao = numeros.indexOf(numeroDigitado); //Pega a posição do número (começa em 0).
			System.out.println("O número " + numeroDigitado + " foi encontrado na posição: " + (posicao + 1));
		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}

		scanner.close();
	}
}
