package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        AlunoDAO dao = new AlunoDAO();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu Aluno");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Alterar Aluno");
            System.out.println("3 - Excluir Aluno");
            System.out.println("4 - Listar Alunos");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe nome do aluno");
                    String nome = entrada.nextLine();
                    System.out.println("Informe cpf do aluno");
                    String cpf = entrada.nextLine();
                    dao.inserir(nome, cpf);
                    break;
                case 2:
                    System.out.println("Informe id do aluno");
                    int id = entrada.nextInt();
                    System.out.println("Informe nome do aluno");
                    nome = entrada.nextLine();
                    System.out.println("Informe cpf do aluno");
                    cpf = entrada.nextLine();
                    dao.atualizar(id, nome, cpf);
                    break;
                case 3:
                    System.out.println("Informe id do aluno");
                    id = entrada.nextInt();
                    dao.remover(id);
            }
        }


        while (opcao != 0);
    }
}