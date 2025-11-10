import java.util.Scanner;
public class Main {
    public static void mostrarDobro(int x) {
        System.out.println("Dobro do número " + (x * 2));
    }

    public static int calcularQuadrado(int x){
        return ( x * x);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número ");

        int x = sc.nextInt();
        mostrarDobro(x);
        System.out.println("Quadrado do número " + calcularQuadrado(x));
    }
    }
