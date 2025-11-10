import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Exibindo a diagonal principal
        System.out.println("\nElementos da diagonal principal:");
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            soma += matriz[i][i];
        }

        // Exibindo a soma
        System.out.println("\nSoma da diagonal principal = " + soma);
    }
}
