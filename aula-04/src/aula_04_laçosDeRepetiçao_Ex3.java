import java.util.Scanner;

public class aula_04_laçosDeRepetiçao_Ex3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int menor21 =0;
		int maior50 =0;
		
		System.out.println("Digite uma idade: ");
		int idade = scanner.nextInt();
		
		while (idade >= 0) {
			if (idade < 21) {
				menor21++;
			}else if (idade > 50) {
				maior50++;
			}
				
			System.out.println("Digite outra idade: ");
			idade = scanner.nextInt();
			}
			
			System.out.println("Total de pessoas com menos de 21 anos. " + menor21);
			System.out.println("Total de pessoas com mais de 50 anos. " + maior50);
			
			scanner.close();
		}

	}


