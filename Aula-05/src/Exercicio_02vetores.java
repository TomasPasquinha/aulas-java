import java.util.Scanner;

public class Exercicio_02vetores {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int[] vetor = new int[10]; 
	        
	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();
	        }

	        System.out.println("\n--- Elementos nos índices ímpares ---");
	        for (int i = 0; i < vetor.length; i++) {
	            if (i % 2 != 0) { 
	                System.out.println( vetor[i]);
	            }
	        }

	        System.out.println("\n--- Elementos pares no vetor ---");
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] % 2 == 0) {
	                System.out.println(vetor[i]);
	            }
	        }

	        int soma = 0;
	        for (int i = 0; i < vetor.length; i++) {
	            soma += vetor[i];
	        }
	        double media = (double) soma / vetor.length;

	        System.out.println("\n--- Soma de todos os elementos ---");
	        System.out.println("Soma: " + soma);

	        System.out.println("\n--- Média dos elementos ---");
	        System.out.println("Média: " + media);

	        scanner.close();
	    }
	}