import java.util.Scanner;

public class aula_04_laçosDeRepetiçao_Ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número (menor): ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número (maior): ");
        int numero2 = scanner.nextInt();
        
        if (numero1 >= numero2) {
            System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
            return;
		}
        System.out.println("Números múltiplos de 3 e 5 no intervalo:");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
	}
}
