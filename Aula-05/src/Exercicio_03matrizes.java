import java.util.Scanner;

public class Exercicio_03matrizes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Diagonal Principal ---");
        int somaPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]);
            somaPrincipal += matriz[i][i];
        }

        System.out.println("\n--- Diagonal Secundária ---");
        int somaSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            int j = 2 - i;
            System.out.println(matriz[i][j]);
            somaSecundaria += matriz[i][j];
        }

        System.out.println("\n--- Soma das Diagonais ---");
        System.out.println("Soma da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaSecundaria);

        scanner.close();
    }
}
