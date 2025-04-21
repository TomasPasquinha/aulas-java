import java.util.Scanner;

public class Exercicio_04matrizes {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double[][] notas = new double[10][4];
	        double[] medias = new double[10];

	        for (int i = 0; i < 10; i++) {
	            double soma = 0;
	            System.out.println("Digite as 4 notas do participante " + (i + 1) + ":");
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Nota " + (j + 1) + ": ");
	                notas[i][j] = scanner.nextDouble();
	                soma += notas[i][j];
	            }
	            medias[i] = soma / 4;
	        }

	        System.out.println("\nMédias dos participantes:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
	        }

	        scanner.close();
	    }
	}