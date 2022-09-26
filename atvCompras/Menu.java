import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListCliente cliente = new ListCliente();
        ListEstoque produto = new ListEstoque();
        ListEstoque produtoI = new ListEstoque();
        ListEstoque produtoN = new ListEstoque();
        int op;
        Cliente cl;
        Estoque pr;
        ProdutoNacional prN;
        ProdutoInternacional prI;
        String nomeDoCliente, cpf, nomeDoProduto, codigoDoProduto;
        double valorProduto;

        do {
            exibeMenu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    nomeDoCliente = in.nextLine();
                    System.out.print("Agora, digite o CPF do cliente: ");
                    cpf = in.nextLine();
                    cl = new Cliente(cpf, nomeDoCliente);
                    cliente.inserirCliente(cl);
                    break;
                case 2:
                    cliente.exibir();
                    break;
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    nomeDoProduto = in.nextLine();
                    System.out.print("Agora, digite o código do produto: ");
                    codigoDoProduto = in.nextLine();
                    System.out.println("Para finalizar o cadastro, insira o valor original do produto: ");
                    valorProduto = in.nextDouble();
                    prN = new ProdutoNacional(nomeDoProduto, codigoDoProduto, valorProduto);
                    produto.inserirProduto(prN);
                    produtoN.inserirProduto(prN);
                    break;
                case 4:
                    System.out.print("Digite o nome do produto: ");
                    nomeDoProduto = in.nextLine();
                    System.out.print("Agora, digite o código do produto: ");
                    codigoDoProduto = in.nextLine();
                    System.out.println("Para finalizar o cadastro, insira o valor original do produto: ");
                    valorProduto = in.nextDouble();
                    prI = new ProdutoInternacional(nomeDoProduto, codigoDoProduto, valorProduto);
                    produto.inserirProduto(prI);
                    produtoI.inserirProduto(prI);
                    break;
                case 5:
                    produto.exibir();
                    break;
                case 6:
                    produtoN.exibir();
                    break;
                case 7:
                    produtoI.exibir();
                    break;
                case 8:

                    break;
                case 0:
                    System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public static void exibeMenu() {
        System.out.println("OPÇÕES");
        System.out.println("1 - CADASTRAR NOVO CLIENTE");
        System.out.println("2 - EXIBIR TODOS OS CLIENTES");
        System.out.println("3 - CADASTRAR NOVO PRODUTO NACIONAL");
        System.out.println("4 - CADASTRAR NOVO PRODUTO INTERNACIONAL");
        System.out.println("5 - EXIBIR TODOS OS PRODUTOS");
        System.out.println("6 - EXIBIR TODOS OS PRODUTOS NACIONAIS");
        System.out.println("7 - EXIBIR TODOS OS PRODUTOS INTERNACIONAIS");
        System.out.println("8 - EFETUAR COMPRA");
        System.out.println("0 - ENCERRAR PROGRAMA");
        System.out.print("DIGITE UMA OPÇÃO: ");
    }
}