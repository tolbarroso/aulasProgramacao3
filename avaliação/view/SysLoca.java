package view;

import java.util.Scanner;

import financeiro.Emprestimo;
import livros.Livros;
import usuario.Usuario;
import financeiro.GerenciaEmprestimo;
import livros.GerenciaLivros;
import usuario.GerenciaUsuario;

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
        String nome, cpf, id, codEmp;

        do {
            exibeMenu();
            op1 = in.nextInt(); in.nextLine();
            switch (op1) {
                case 1: exibeMenuUsuario();
                        op2 = in.nextInt();
                        switch (op2) {
                            case 1: // Cadastrar novo usuario
                                
                                break;
                            default:
                                break;
                        }
                        break;
                case 2: exibeLivro();
                        op3 = in.nextInt();
                        switch (op3) {
                            case 1: // Cadastrar 
                                
                                break;
                            default:
                                break;
                        }
                        break;
                case 3: exibeMenuEmprestimo();
                        op4 = in.nextInt();

                        switch (op4) {
                            case 1: //executar empréstimo
                                    System.out.println("Insira o seu cpf: ");
                                    cpf = in.nextLine();
                                    usuarios.buscarUser(cpf);

                                    System.out.println("Insira o código do livro (ISBN ou ID): ");
                                    id = in.nextLine();
                                    livros.buscarLiv(id);

                                    if(usuarios.buscarUser() != null && livros.buscarLiv() != null){
                                        System.out.println("Insira o número do emprestimo: ");
                                        codEmp = in.nextLine();
                                        emprestimos.inserirEmprestimo(codEmp);
                                    }
                                    break;
                            case 0: System.out.println("Sistema Encerrado");
                                    break;
                            default: System.out.println("Opção inválida");
                        }
                        break;
                case 0: System.out.println("Sistema Encerrado");
                        break;
                default: System.out.println("Opção inválida");
            }           
        } while (op1 != 0);
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
        System.out.println("1 - Executar Emprestimo");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }

    public static void exibeLivro() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um livro físico");
        System.out.println("2 - Cadastrar um eBook");
        System.out.println("2 - Cadastrar um AudioBook");
        System.out.println("3 - Exibir todos os livros cadastrados");
        System.out.println("4 - Remover um livro");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}