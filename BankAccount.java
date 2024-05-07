package com.Bridgelabez.Level1;

public class BankAccount {
    //Instance variable
    private double balance;
    private String accountNumber;
    //constructor
    public BankAccount(String accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0.0;//Initialize balance to zero
    }
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
    // Method to get current balance
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        // Create object of class
        BankAccount account1 = new BankAccount("4311028");
        // Deposit and withdraw money
        account1.deposit(9000.0);
        account1.withdraw(250.0);
        // Print current balance
        System.out.println("Current balance for account " + account1.accountNumber + ": Rs" + account1.getBalance());
    }
}

