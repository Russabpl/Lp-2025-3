import java.util.Scanner;

public class Main {
    public static void alterarNumero(int x) {
        x = 100;
    }

    public static void alterarVetor(int v[]){
        v[0] = 100;

    }
    public static void main(String[] args) {
        int a = 10;

        alterarNumero(a);
        System.out.println("Numero alterado " + a);

        int[] vetor = {10, 20, 30};
        alterarVetor(vetor);
        for (int i = 0; i < vetor.length; i++)
            System.out.print(
                    vetor[i] + " ");
    }
}

