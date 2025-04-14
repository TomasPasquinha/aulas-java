import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o salario: ");
		float salario = input.nextFloat();
		System.out.println("Digite o abono: ");
		float abono = input.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.println("Novo salario e: " + novoSalario);
		
		System.out.println("Sistema finalizado.");
		
	}

}
