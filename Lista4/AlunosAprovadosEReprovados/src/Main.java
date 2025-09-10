import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[10];
        float[] notas = new float[10];

        List<String> aprovados = new ArrayList<>();
        List<String> reprovados = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.nextLine();

            System.out.print("Digite a nota de " + alunos[i] + ": ");
            notas[i] = sc.nextFloat();
            sc.nextLine(); // limpar buffer

            if (notas[i] >= 7.0) {
                aprovados.add(alunos[i]);
            } else {
                reprovados.add(alunos[i]);
            }
        }

        System.out.println("\nAlunos Aprovados: " + aprovados);
        System.out.println("Alunos Reprovados: " + reprovados);
    }
}
