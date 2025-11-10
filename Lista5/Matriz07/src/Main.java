import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Inicializando o maior valor com o primeiro elemento da matriz
        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        // Procurando o maior elemento
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        // Exibindo o resultado
        System.out.println("\nMaior valor encontrado: " + maior);
        System.out.println("Posição: linha " + linha + " coluna " + coluna);


    }
}
