import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       int [][] mat = new int[5][5];

       for (int i = 0; i< 5; i ++){
           for (int j = 0; j< 5; j++){

               mat[i][j] = (int) (Math.random() *21);

           }
       }
           int maior = mat[0][0]; //maior recebe primeiro elemento de mat
           int iMaior = 0; int jMaior = 0;
           for ( int i = 1; i< mat.length; i++){
               for (int j = 0; j< mat.length; j++){
                   if (mat[i][j] > maior ){
                       maior = mat[i][j]; iMaior = i; jMaior = j;
                   }
               }
           }


        String s = "";
        System.out.println("O maior elemento " + maior + " na posição [" + iMaior + "][" +jMaior +"]");
    }
}




