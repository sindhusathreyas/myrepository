package com.tnsif.bankaccount;

//CheckingAccount subclass
class CheckingAccount extends Account {
 private double overdraftLimit;
 
 public CheckingAccount(double balance, double overdraftLimit) {
     super(balance);
     this.overdraftLimit = overdraftLimit;
 }
 
 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " in Checking Account");
 }
 
 @Override
 public void withdraw(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " from Checking Account");
     } else {
         System.out.println("Overdraft limit exceeded in Checking Account");
     }
 }
 
 @Override
 public double getBalance() {
     return balance;
 }
}


