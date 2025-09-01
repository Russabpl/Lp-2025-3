import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int num;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o número desejado para a tabuada: ");
        num = entrada.nextInt();

        for( int i = 1; i < 11; i++){
            System.out.println(num + " " + " X " + " " + i + " = " +  i * num);


        }
    }
}