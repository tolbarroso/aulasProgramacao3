package env;

import java.util.ArrayList;
import user.*;

public class Banco {
  private ArrayList<Account> accounts;

  public Banco() {
    this.accounts = new ArrayList();
  }

  private boolean accountExist(String accountNumber) {
    if (getConta(accountNumber) == null) {
      return false;
    }
    return true;
  }

  public void realizarDepositoEmConta(double valor, String nConta) {
    Account conta = getConta(nConta);
    if (conta != null) {
      conta.deposit(valor);
    }
  }

  private Account getConta(String nConta) {
    for (Account conta : accounts) {
      if (conta.getAccountNumber() == nConta) {
        return conta;
      }
    }
    return null;
  }

  public void realizarSaqueEmConta(double valor, String nConta) {
    Account conta = getConta(nConta);
    if (conta != null) {
      conta.withdraw(valor);
    }
  }

  public void criarConta(String accountNumber, String userName) {
    if (!accountExist(accountNumber)) {
      Account conta = new Account(accountNumber, userName);
      accounts.add(conta);
    }
  }

  public int getNumeroContas() {
    return accounts.size();
  }

  public double getTotalDeSaldoBanco() {
    double saldo = 0;
    for (Account conta : accounts) {
      saldo += conta.getBalance();
    }
    return saldo;
  }

  public boolean removerConta(String numeroConta) {
    Account conta = getConta(numeroConta);
    if (conta != null) {
      accounts.remove(conta);
      return true;
    }
    return false;
  }
}