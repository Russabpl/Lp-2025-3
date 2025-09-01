import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número inteiro positivo: ");
        int N = sc.nextInt();

        int soma = 0;


        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos pares de 1 até " + N + " é: " + soma);

        }
    }
