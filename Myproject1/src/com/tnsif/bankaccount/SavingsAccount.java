package com.tnsif.bankaccount;
//SavingsAccount subclass
class SavingsAccount extends Account {
 private double interestRate;
 
 public SavingsAccount(double balance, double interestRate) {
     super(balance);
     this.interestRate = interestRate;
 }
 
 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " in Savings Account");
 }
 
 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " from Savings Account");
     } else {
         System.out.println("Insufficient funds in Savings Account");
     }
 }
 
 @Override
 public double getBalance() {
     return balance + (balance * interestRate / 100);
 }
}

