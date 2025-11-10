import java.util.Scanner;


public class Main {
    public static void entradaDados(float[] vet , String no) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        no = entrada.next();
        System.out.println("Digite as 3 notas dos alunos: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = entrada.nextFloat();


        }
    }

    public static void aplicarBonus(float [] vet){
        for (int i= 0; i< vet.length; i++){
            vet[i]= vet[i] + 0.5f;
        }
    }

    public static float calcularMedia(float[] vet){
        float soma = 0;
        for (float v : vet) {
            soma += v;
        }
        return soma /vet.length;
    }
    public static void  exibirRelatorio(String no, float[] vet, float me){
        System.out.println("Notas do aluno " + no + ": " );
        for (float v : vet){
            System.out.println(v + " ");
        }

        
    }
    public static void main(String[] args) {
        String nome = " ";
        float[] notas = new float[3];
        entradaDados(notas, nome);
        aplicarBonus(notas);
        float media = calcularMedia(notas);
        System.out.println("A media das notas é " + media);

        exibirRelatorio(nome, notas, media);
    }


}