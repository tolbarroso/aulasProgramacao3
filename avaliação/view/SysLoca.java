package view;

import java.util.Scanner;

import financeiro.Emprestimo;
import livros.Livros;
import usuario.Usuario;

public class SysLoca {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Info usuarios = new Info();
        Info livros = new Info();
        Info emprestimos = new Info();

        Usuario user;
        Livros liv;
        Emprestimo emp;

        int op1, op2, op3, op4;
        String nome, matr;

        do {
            exibeMenu();
            op1 = in.nextInt(); in.nextLine();
            switch (op1) {
                case 1: System.out.print("Informe a matrícula do aluno: ");
                        matr = in.nextLine();
                        System.out.print("Informe o nome do aluno: ");
                        nome = in.nextLine();
                        al = new Aluno (matr, nome);
                        turma.inserirAluno(al);
                        break;
                case 2: System.out.print("Informe a matrícula do aluno: ");
                        matr = in.nextLine();
                        System.out.print("Informe o nome do aluno: ");
                        nome = in.nextLine();
                        al = new Aluno (matr, nome);
                        turma.inserirAlunoFinal(al);
                        break;
                case 3: turma.exibir();
                        break;
                case 4: turma.removerPrimeiro();
                        break;
                case 5: turma.removerUltimo();
                        break;
                case 0: System.out.println("Bye bye");
                        break;
                default: System.out.println("Opção inválida");
            }           
        } while (op != 0);
    }
    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1 - Menu Usuários");
        System.out.println("2 - Menu Livros");
        System.out.println("3 - Menu Emprestimos");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }

    public static void exibeMenuUsuario() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um novo usuário");
        System.out.println("2 - Visualizar informações de um usuário");
        System.out.println("3 - Exibir todos os usuários cadastrados");
        System.out.println("4 - Remover um usuário");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }

    public static void exibeMenuEmprestimo() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um novo usuário");
        System.out.println("2 - Cadastrar novo aluno no final da lista");
        System.out.println("3 - Exibir alunos da turma");
        System.out.println("4 - Remover aluno do início da lista");
        System.out.println("5 - Remover aluno do final da lista");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }

    public static void exibeLivro() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um livro físico");
        System.out.println("2 - Cadastrar um eBook");
        System.out.println("2 - Cadastrar um AudioBook");
        System.out.println("3 - Exibir todos os usuários cadastrados");
        System.out.println("4 - Remover um usuário");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}