import java.util.Scanner;

//todo programa java começa definido uma classe

public class Main {
    // definição de função main, executada quando o programa roda

    public static void main(String[] args) {

        // Comando de saida - a função println pertence a classe System
        System.out.println("Hello World!");
        System.out.println("Bom dia!");

        //java é fortemente tipado (float, char, int, double, boolean)
        // declara a variável e atribui valor a ela

        char letra = 'A';
        float nota = 6.5f ;
        int idade = 19;
        boolean resposta = true;
        String nome = "Bianca";

        //Exibe os dados das variáveis para o usuário
        System.out.println("Letra: " + letra + "\nNota: " + nota +
                "\nIdade: " + idade + "\nResposta: " + resposta +
                "\nNome: " + nome);

        // Comando de entrada
        //Utilização da classe Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite outra nota: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = entrada.next();

        float soma = nota1 + nota2;
        float media = soma/2;

        System.out.println("O aluno " + nomeAluno + " tem como media "+ media);


        System.out.println("Digite seu nome: ");
        String nomeFuncionario = entrada.next();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        float horasTrabalhadas = entrada.nextFloat();

        System.out.println("Informe o valor da hora trabalhada:");
        float valorHora = entrada.nextFloat();

        //calcular horas trabalhadas


        float salarioBruto = horasTrabalhadas * valorHora;

        System.out.println("O salario bruto do funcionario" + nomeFuncionario + "é de" + salarioBruto);

    }
}