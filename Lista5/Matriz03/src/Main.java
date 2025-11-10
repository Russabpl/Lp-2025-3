import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
          //pede pro usuario entra com os dados
        System.out.println("Informe o tamanho da matriz");
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();

        int [][] mat = new int[N][N];
          // cria a matriz
        for (int i=0; i< N; i++){
            for (int j=0; j<N; j++){
                if (i == j){
                    mat[i][j] = 1;
                }
                else {
                    mat[i][j] = 0;
                }
            }
        }
            //exibe a matriz

        for(int i=0; i< N; i++){
            for (int j=0; j<N; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();

        }



        }
    }
