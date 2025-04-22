import java.util.HashSet; //Para armazenar apenas números únicos (sem repetições).
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Aula_06_exercicio_03collectionSet {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        System.out.println("Digite 10 números inteiros (sem repetir):");

        while (numeros.size() < 10) {
            System.out.print("Digite o " + (numeros.size() + 1) + "º número: ");
            int numero = scanner.nextInt();

            //Tenta adicionar ao Set; retorna false se o número já existe.
            if (!numeros.add(numero)) {
                System.out.println("Número repetido! Tente outro.");
            }
        }

        System.out.println("\nNúmeros digitados (sem repetição):");

        Iterator<Integer> iterator = numeros.iterator();
        //Verifica se ainda há elementos a serem percorridos.
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            System.out.println(numero);
        }

        scanner.close();
    }
}