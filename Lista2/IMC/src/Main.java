import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


   // entrada de dados
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o nome do paciente: ");
        String nome = entrada.nextLine();
        System.out.println("Informe o peso: ");
        float peso = entrada.nextFloat();
        System.out.println("Informe a altura: ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura*altura);

        String classificacao;
        if(imc < 18.5f){
            classificacao = "Abaixo do peso";

        }

        else if(imc>= 18.5f && imc< 25.0f){
            classificacao = "Peso Normal, fique tranquilo!";
        }

        else if (imc >25.0f && imc < 30.0f){
            classificacao = "Sobrepeso, esta um pouco acima.";
        }

        else if (imc >= 30.0f){
            classificacao = "Obesidade, procure um médico!";
        }
        else{
            classificacao = "Não foi possivel classificar";
        }

        System.out.println("O paciente" + nome + "tem IMC = " + imc + " e esta classificado como: "+ classificacao);
    }



}