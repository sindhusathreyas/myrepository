package com.tnsif.bankaccount;
public class BankApp {
 public static void main(String[] args) {
     Account savings = new SavingsAccount(1000, 5);
     savings.deposit(500);
     savings.withdraw(200);
     savings.displayBalance();

     Account checking = new CheckingAccount(500, 300);
     checking.deposit(200);
     checking.withdraw(900);
     checking.displayBalance();
 }
}



