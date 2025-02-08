package com.celcom.assignment2;

import java.util.*;

class Account {
 private String accountNumber;
 private String accountHolder;
 private double balance;

 public Account(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolder() {
     return accountHolder;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited " + amount + " successfully. New Balance: " + balance);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn " + amount + " successfully. New Balance: " + balance);
     } else {
         System.out.println("Invalid withdraw amount or insufficient balance.");
     }
 }
}


class Bank {
 private Map<String, Account> accounts;

 public Bank() {
     accounts = new HashMap<>();
 }

 public void addAccount(Account account) {
     accounts.put(account.getAccountNumber(), account);
     System.out.println("Account added successfully for " + account.getAccountHolder());
 }

 public void removeAccount(String accountNumber) {
     if (accounts.containsKey(accountNumber)) {
         accounts.remove(accountNumber);
         System.out.println("Account " + accountNumber + " removed successfully.");
     } else {
         System.out.println("Account not found.");
     }
 }

 public Account getAccount(String accountNumber) {
     return accounts.get(accountNumber);
 }
}

public class Program7 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
	     Account acc1 = new Account("1001", "Alice", 5000.0);
	     Account acc2 = new Account("1002", "Bob", 3000.0);

	     bank.addAccount(acc1);
	     bank.addAccount(acc2);

	     acc1.deposit(2000);
	     acc2.withdraw(1000);

	     bank.removeAccount("1001");
	}

}
