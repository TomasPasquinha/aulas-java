import java.util.Scanner;
import java.util.Stack;

public class aula_07_pilha {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMenu da Pilha de Livros");
            System.out.println("1: Adicionar um novo livro");
            System.out.println("2: Ver todos os livros na pilha");
            System.out.println("3: Retirar o último livro adicionado");
            System.out.println("0: Sair do programa");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do livro que você quer adicionar: ");
                        String livro = scanner.nextLine();
                        pilha.push(livro);
                        System.out.println("\"" + livro + "\" foi adicionado à pilha.");
                        break;

                    case 2:
                        if (pilha.isEmpty()) {
                            System.out.println("A pilha está vazia. Nenhum livro foi adicionado ainda.");
                        } else {
                            System.out.println("Livros atualmente na pilha (do topo para a base):");
                            for (int i = pilha.size() - 1; i >= 0; i--) {
                                System.out.println("- " + pilha.get(i));
                            }
                        }
                        break;

                    case 3:
                        if (pilha.isEmpty()) {
                            System.out.println("Não há livros para remover. A pilha está vazia.");
                        } else {
                            String livroRemovido = pilha.pop();
                            System.out.println("\"" + livroRemovido + "\" foi removido da pilha.");
                        }
                        break;

                    case 0:
                        System.out.println("Obrigado por usar o gerenciador de pilha de livros. Até a próxima!");
                        break;

                    default:
                        System.out.println("Opção inválida. Por favor, escolha entre 0, 1, 2 ou 3.");
                        break;
                }

            } else {
                System.out.println("Entrada inválida. Digite apenas números.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}