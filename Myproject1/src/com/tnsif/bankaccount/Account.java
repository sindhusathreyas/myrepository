package com.tnsif.bankaccount;
//Abstract class Account
abstract class Account {
 protected double balance;
 
 public Account(double balance) {
     this.balance = balance;
 }
 
 // Abstract methods
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getBalance();
 
 // Concrete method for displaying balance
 public void displayBalance() {
     System.out.println("Current balance: " + getBalance());
 }
}




