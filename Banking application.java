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

	 // to deposit amount
	 public void deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	         System.out.println("Deposited " + amount + " successfully. New Balance: " + balance);
	     } else {
	         System.out.println("Deposit amount must be positive.");
	     }
	 }
	
	 // to withdraw
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
	
	 // add new customer account 
	 public void addAccount(Account account) {
	     accounts.put(account.getAccountNumber(), account);
	     System.out.println("Account added successfully for " + account.getAccountHolder());
	 }
	
	 // remove account
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
		
		Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter number of accounts to create: ");
        int numAccounts = scanner.nextInt();
        scanner.nextLine();
        
        // to create the needed number of accounts
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("Enter details for Account " + (i + 1) + ":");
            System.out.println("Account Number: ");
            String accNumber = scanner.nextLine();
            System.out.print("Account Holder Name: ");
            String accHolder = scanner.nextLine();
            System.out.print("Initial Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); 

            Account account = new Account(accNumber, accHolder, balance);
            bank.addAccount(account);
        }

        // Providing options to the user to select the process
        // can be repeated again if needed else exit the application
        
        while (true) {
            System.out.println("\nChoose an operation: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Remove Account");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 4) break;

            System.out.print("Enter Account Number: ");
            String accNumber = scanner.nextLine();
            Account account = bank.getAccount(accNumber);

            if (account == null) {
                System.out.println("Account not found.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    bank.removeAccount(accNumber);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
        System.out.println("End Application");
	}

}
