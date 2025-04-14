import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = input.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4 = input.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A média final é: %.1f" , media);

	}

}
