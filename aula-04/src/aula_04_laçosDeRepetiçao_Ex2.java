import java.util.Scanner;

public class aula_04_laçosDeRepetiçao_Ex2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int pares = 0;
		int impares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			int numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números pares: " + impares);
		
		scanner.close();
	}

}
