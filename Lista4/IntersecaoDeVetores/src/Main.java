import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite 10 números para o vetor B:");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = sc.nextInt();
        }

        Set<Integer> interseccao = new HashSet<>();
        for (int numA : vetorA) {
            for (int numB : vetorB) {
                if (numA == numB) {
                    interseccao.add(numA);
                }
            }
        }

        System.out.println("Vetor Interseção:");
        for (int num : interseccao) {
            System.out.print(num + " ");
        }
    }
}
