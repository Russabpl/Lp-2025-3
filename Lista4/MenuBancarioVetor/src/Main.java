import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        float saldo = 1000;

        do {
            System.out.println("=====MENU BANCÁRIO=====");

            System.out.println("Digite uma das opções a baixo: ");
            System.out.println("1. Saldo \n 2. Depositar \n 3. Sacar \n 4. Extrato \n 0. Sair.");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:

                    System.out.println("Saldo da conta " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor do depósito");
                    float x = entrada.nextFloat();
                    saldo = saldo + x;
                    break;

                case 3:
                    System.out.println("Informe o valor do saque");
                    float y = entrada.nextFloat();
                    if (saldo >= y){
                        saldo = saldo - y;
                    }

                    else System.out.println("Saldo insuficiente");
                    break;

                case 4: break;
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção ivalida");
            }

        }       while (opcao!= 0 );


    }
}