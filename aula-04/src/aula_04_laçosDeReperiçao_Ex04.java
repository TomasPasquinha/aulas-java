import java.util.Scanner;

public class aula_04_laçosDeReperiçao_Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int countBackend = 0;
		int countFrontendMulheres = 0;
		int countMobileHomens40Mais = 0;
		int countFullStackNBMenores30 = 0;
		
		int totalPessoas = 0;
		int somaIdades = 0;
		
		char continuar ='S';
		
		while (continuar == 'S' || continuar == 's') {
			System.out.println("\nDigite a idade do Colaborador: ");
			int idade = scanner.nextInt();
			
			System.out.println("Identidade de Gênero:");
			System.out.println("1 – Mulher Cis");
			System.out.println("2 – Homem Cis");
			System.out.println("3 – Não Binário");
			System.out.println("4 – Mulher Trans");
			System.out.println("5 – Homem Trans");
			System.out.println("6 – Outros");		
			int genero = scanner.nextInt();
			
			System.out.println("Pessoa Desenvolvedora: ");
			System.out.println("1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");
			int tipoDev = scanner.nextInt();
			
			totalPessoas++;
			somaIdades += idade;
			
			if (tipoDev == 1) {
                countBackend++;
			}
			
			if (tipoDev == 2 && (genero == 1 || genero == 4)) {
				countFrontendMulheres++;
			}
			
			if (tipoDev == 3 && (genero == 2 || genero == 5) && idade > 40) {
				countMobileHomens40Mais++;
			}
			
			if (tipoDev == 4 && genero == 3 && idade < 30) {
				countFullStackNBMenores30++;
			}
			
			System.out.println("Deseja continuar? (S/N): ");
			continuar = scanner.next().charAt(0);
		}
		
		System.out.println("\n===== RESULTADOS DA PESQUISA =====");
        System.out.println("1. Pessoas desenvolvedoras Backend: " + countBackend);
        System.out.println("2. Mulheres (Cis e Trans) desenvolvedoras Frontend: " + countFrontendMulheres);
        System.out.println("3. Homens (Cis e Trans) desenvolvedores Mobile com mais de 40 anos: " + countMobileHomens40Mais);
        System.out.println("4. Não Binários desenvolvedores FullStack com menos de 30 anos: " + countFullStackNBMenores30);
        System.out.println("5. Total de pessoas que responderam: " + totalPessoas);
        
        if (totalPessoas > 0) {
        	double mediaIdade = (double) somaIdades / totalPessoas;
        	System.out.printf("6. Média de idade das pessoas: %.2f\n", mediaIdade);
        }else {
        	 System.out.println("Nenhuma pessoa respondeu à pesquisa.");
        }
        
        scanner.close();
	}

}
