import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] soma = new int[3][3];

        // Leitura da primeira matriz
        System.out.println("Digite os elementos da primeira matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }

        // Leitura da segunda matriz
        System.out.println("\nDigite os elementos da segunda matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }

        // Soma das matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibindo a matriz soma
        System.out.println("\nMatriz resultante da soma (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }


    }
}
