
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int[] todos = new int[16]; // aqui guardamos todos os valores
        int index = 0;

        System.out.println("\nDigite a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                int valor = sc.nextInt();
                matriz[i][j] = valor;
                todos[index] = valor; // guardando também no vetor
                index++;
            }
        }

        System.out.println("\nElementos únicos:");
        for (int i = 0; i < todos.length; i++) {
            int num = todos[i];
            int cont = 0;

            // conta quantas vezes o número aparece
            for (int j = 0; j < todos.length; j++) {
                if (todos[j] == num) {
                    cont++;
                }
            }

            // se apareceu só uma vez, mostra
            if (cont == 1) {
                System.out.print(num + " ");
            }
        }
    }
}