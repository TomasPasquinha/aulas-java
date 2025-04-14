import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		float n1 = input.nextFloat();
		System.out.println("Digite o segundo numero");
		float n2 = input.nextFloat();
		System.out.println("Digite o terceiro numero");
		float n3 = input.nextFloat();
		System.out.println("Digite o quarto numero");
		float n4 = input.nextFloat();

		float calculo = (n1*n2) - (n3*n4);
		
		System.out.printf("Diferença: %.1f", calculo);
		
	}

}
