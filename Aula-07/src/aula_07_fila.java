import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class aula_07_fila {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		
		int opcao;
		
		do {
			
			System.out.println("\n------MENU-----");
			System.out.println("1: Adicionar novo cliente");
			System.out.println("2: Listar todos os clientes");
			System.out.println("3: Chmar um cliente");
			System.out.println("0: Sair");
			System.out.print("Excolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nome = scanner.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado à fila.");
				break;
				
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está fazia. ");
				} else {
					System.out.println("Clientes na fila: ");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
				
			case 3:
                if (fila.isEmpty()) {
                    System.out.println("A fila está vazia. Ninguém para chamar.");
                } else {
                    String chamado = fila.poll();
                    System.out.println("Cliente chamado: " + chamado);
                }
                break;
				
			case 0:
				System.out.println("Encerrando o programa...");
				break;
				
			default:
				System.out.println("Opção invalida. Tente novamente. ");
				break;
		 }

	 } while (opcao != 0);

		scanner.close();
  }
}
