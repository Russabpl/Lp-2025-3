import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //vetor tamanho 3 contendo nomes
        String[] nomes = new String[3];

        //matriz 3x4 contendo notas

        float [][] notas = new float[3][4];

        // entrada de dados
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i< 3; i++){

            System.out.println("Informe o nome do aluno ");
            nomes[i] = entrada.next();
            System.out.println("Informe as 4 notas do aluno ");

            for (int j = 0; j< 4; j++){
                 notas[i][j]= entrada.nextFloat();
            }
        }


        // calcular a media de cada aluno

       float  soma = 0;
        for ( int i = 0; i< 3; i ++){
            soma = 0;
            for (int j = 0; j< 4; j++){
                soma += notas [i][j];
            }

            System.out.println("A média do aluno " + nomes[i] + " é " + soma/4);
        }
    }
}
