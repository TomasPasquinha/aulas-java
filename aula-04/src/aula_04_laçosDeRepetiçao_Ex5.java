import java.util.Scanner;

public class aula_04_laçosDeRepetiçao_Ex5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite números inteiros:");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break; 
            }

            if (numero > 0) {
                soma += numero;
            }
        }

        System.out.println("A soma dos números positivos é: " + soma);

        scanner.close();

	}

}
