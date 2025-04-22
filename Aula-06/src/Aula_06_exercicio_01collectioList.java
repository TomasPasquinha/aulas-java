import java.util.ArrayList; // Importa a classe ArrayList para usar listas dinâmicas
import java.util.Collections; // Importa a classe Collections para ordenar a lista
import java.util.Scanner; 

public class Aula_06_exercicio_01collectioList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Criação de um ArrayList para armazenar as cores digitadas
		ArrayList<String> cores = new ArrayList<>();
		
		
		System.out.println("Programa iniciado. ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			String cor = scanner.nextLine(); 
			cores.add(cor); 
		}
		  // Exibe as cores na ordem em que foram digitadas
			System.out.println("\nCores digitadas: ");
			for (String cor : cores) {
				System.out.println(cor);
		}
			// Ordena a lista em ordem alfabética
			Collections.sort(cores);
		
		// Exibe as cores ordenadas
		System.out.println("\nCores em ordem alfabética: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		scanner.close();
		}
	}


