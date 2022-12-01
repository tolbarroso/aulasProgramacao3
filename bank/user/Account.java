package user;

public class Account {
  //Atributos
  protected String accountNumber;
  protected double balance;
  protected String clientName;
  protected AccountType accountType;

  //Construtor
  public Account (String accountNumber, String clientName){
    this.accountNumber = accountNumber;
    this.balance = 0;
    this.clientName = clientName;
  }
  public void deposit( double value){
    balance += value;
  }
  public void withdraw (double value){
    if (balance >= value){
      balance -= value;
    }
  }

  //Getters
  public double getBalance(){
    return this.balance;
  }

  public String getAccountNumber(){
    return this.accountNumber;
  }
}
