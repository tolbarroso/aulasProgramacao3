package geral;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Audio streamer1 = new Audio();
        Audio musica = new Audio();
        Audio podcast = new Audio();
        int op;
        Usuario user;
        String nome, matr;
        do {
            exibeMenu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    al = new Aluno(matr, nome);
                    turma.inserirAluno(al);
                    break;
                case 2:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    al = new Aluno(matr, nome);
                    turma.inserirAlunoFinal(al);
                    break;
                case 3:
                    turma.exibir();
                    break;
                case 4:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.exibirAluno(matr);
                    break;
                case 5:
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.alterarMedia(matr);
                    break;
                case 6:
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.alterarFalta(matr);
                    break;
                case 7:
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.remover(matr);
                    break;
                case 8:
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.remover(matr);
                    break;
                case 9:
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.remover(matr);
                    break;
                case 10:
                    System.out.println("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.remover(matr);
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar novo usuário");
        System.out.println("2 - Cadastrar nova música");
        System.out.println("3 - Cadastrar novo podcast");
        System.out.println("4 - Exibir todas as músicas disponíveis");
        System.out.println("5 - Exibir todos os podcasts disponíveis");
        System.out.println("6 - Pesquisar música");
        System.out.println("7 - Pesquisar podcast");
        System.out.println("8 - Dar play");
        System.out.println("9 - Dar pause");
        System.out.println("10 - Replay");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}