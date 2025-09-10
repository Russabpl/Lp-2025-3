import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor original com 5 posições
        int[] numeros = new int[5];
        // Vetor para armazenar os valores dobrados
        int[] dobro = new int[5];

        // Leitura dos 5 números
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            // Já calcula o dobro na mesma hora
            dobro[i] = numeros[i] * 2;
        }

        // Exibindo os dois vetores
        System.out.println("\nVetor original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nVetor com dobro dos valores:");
        for (int i = 0; i < dobro.length; i++) {
            System.out.print(dobro[i] + " ");
        }


    }
}