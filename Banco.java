package banco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Banco {

    private ArrayList<Conta> contas;
    
    Scanner in = new Scanner(System.in);
    Random aleatorio = new Random();
    int numero = aleatorio.nextInt(100) + 1;
    
    public Banco() {
        this.contas = new ArrayList();
    }

    private boolean contaExistente(String numeroConta){
        for(Conta objetoConta: contas){
            if (objetoConta.getNumeroConta() == numeroConta){
                return true;
            }
        }
        return false;
    }
    
    public void criarConta(String nomeTitular, String numeroConta){
        if (!contaExistente(numeroConta)){
            contas.add(new Conta(nomeTitular, numeroConta, tipoDeConta));
        }
    }

 /*public void criaçãoConta(String nomeTitular, int numeroConta) {
        System.out.println("Para criar sua conta, insira seu Nome: ");
        String nome = in.next();
        nomeTitular = nome;
            
        System.out.println("Agora, iremos gerar o número da sua conta.");
        System.out.println("O número da sua conta será " + numero);
        numeroConta = numero;

        System.out.println("Você iniciará sua conta com saldo = R$0,00. A partir da abertura da conta, você poderá realizar depositos para começar a movimentar-lá.");
        System.out.println("Seja bem vindo!");
    }*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(100) + 1;
        
        Conta conta = new Conta(in.next(), numero, tipoDeConta.CORRENTE);
        int contador = 0;
        
        while (contador < 3) {
            contador = contador + 1;
            
            System.out.println("MENU BANCO BARROSO: ");
            System.out.println("1- Criar Conta");
            System.out.println("2- Acessar Informações da Conta");
            System.out.println("3- Realizar Depósito");
            System.out.println("4- Realizar Saque");
            int escolha = in.nextInt();

            if (escolha == 1) {

                
                System.out.println("Para criar sua conta, insira seu nome: ");
                conta.setNomeTitular(in.next());

                System.out.println("Agora, iremos gerar o número da sua conta.");
                System.out.println("O número da sua conta será " + numero);
                //conta.setNumeroConta(numero);
                System.out.println("Você iniciará sua conta com saldo = R$0,00. A partir da abertura da conta, você poderá realizar depositos para começar a movimentar-lá.");
                conta.setSaldo(0);
                System.out.println("Seja bem vindo!");

            }

            if (escolha == 2) {
                //metodo array para pesquisa ????????????????
            }

            if (escolha == 3) {
                System.out.println("Insira o número da sua conta: ");
                // forma de pesquisar pelo número da conta para acessar o saldo ?????????????

                System.out.println("Insira o valor que você gostaria de depositar na sua conta: ");
                double valorInserido = in.nextDouble();

                conta.depositar(valorInserido);
                System.out.println("Agora seu saldo é: R$" + conta.getSaldo());
            }

            if (escolha == 4) {
                System.out.println("Insira o número da sua conta: ");
                // forma de pesquisar pelo número da conta para acessar o saldo ?????????????

                System.out.println("Insira o valor que você gostaria de retirar da sua conta: ");
                double valorRetirado = in.nextDouble();

                conta.sacar(valorRetirado);
                System.out.println("Agora seu saldo é: R$" + conta.getSaldo());
            }
            
            System.out.println("Gostaria de vizualidar novamente o menu?");
            System.out.println("    1=> Sim        2=>Gostaria de sair  ");
            int resposta2 = in.nextInt();
            
            if(resposta2 == 1){
                contador = contador - 1;
            }
            if(resposta2 == 2){
                contador = 3;
            }
        }
    }
}
   