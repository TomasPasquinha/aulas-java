import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula_06_exercicio_04collectionSet {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i * 5);
        }

        System.out.println("Digite um número inteiro para verificar:");
        int numeroDigitado = scanner.nextInt();

        if (numeros.contains(numeroDigitado)) {
            System.out.println("Número " + numeroDigitado + " Encontrado!");
        } else {
            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
        }

        scanner.close();
    }
}