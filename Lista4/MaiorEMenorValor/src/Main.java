import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[8];


        System.out.println("Digite 8 números reais:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }


        double maior = numeros[0];
        double menor = numeros[0];
        int posMaior = 0;
        int posMenor = 0;


        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }


        System.out.println("\nMaior valor: " + maior + " (posição " + posMaior + ")");
        System.out.println("Menor valor: " + menor + " (posição " + posMenor + ")");


    }
}
