import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float salarioBruto, adcionalNoturno, horasExtras, descontos;
		
		System.out.print("Digite o salário bruto: ");
		salarioBruto = input.nextFloat();
		System.out.print("Digite o adcional noturno: ");
		adcionalNoturno = input.nextFloat();
		System.out.print("Digite as horas extras: ");
		horasExtras = input.nextFloat();
		System.out.print("Digite o desconto: ");
		descontos = input.nextFloat();

		float salarioLiquido = salarioBruto + adcionalNoturno + (horasExtras * 5) - descontos;
		
			System.out.printf("Salário Líquido: %.2f",salarioLiquido);
			
		
	
	}

}
