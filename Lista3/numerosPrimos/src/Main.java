import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número inteiro positivo: ");
        int N = sc.nextInt();

        int contadorDivisores = 0;


        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { // Se for divisível
                contadorDivisores++;
            }
        }


        if (contadorDivisores == 2) {
            System.out.println("O número " + N + " é primo");
        } else {
            System.out.println("O número " + N + " não é primo");
        }
        }
    }
