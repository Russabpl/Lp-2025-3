import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        Map<Integer, Integer> frequencia = new LinkedHashMap<>();

        for (int num : vetor) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequência dos valores:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println("Número " + entry.getKey() + " aparece " + entry.getValue() + " vezes");
        }
    }
}
