import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = entrada.next();
        System.out.println("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite o peso da primeira prova");
        float p1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Digite o peso da segunda prova: ");
        float p2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = entrada.nextFloat();
        System.out.println("Digite o peso da terceira nota");
        float p3 = entrada.nextFloat();

        //calculo da media

        float media = (nota1 * p1 + nota2 * p2 + nota3 * p3) / (p1 + p2 + p3);

        //determinação da situação

        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 4.0) {
            situacao = "Exame";
        } else {
            situacao = "Reprovado";
        }


        // Exibição do boletim
        System.out.println("\n=== BOLETIM DO ALUNO ===");
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Média Ponderada: " +  media);
        System.out.println("Situação: " + situacao);


        // Se ficar em exame, calcular nota mínima necessária
        if (situacao.equals("Exame")) {
            double notaExameMinima = 10 * (5.0 - (media / 2.0));
            System.out.println("Nota mínima no exame para aprovação: "+ notaExameMinima);


        }
    }
}