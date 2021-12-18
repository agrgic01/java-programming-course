package com.agrgic.Lessons.L79ConstructorsPart1;

public class BankAccount {


    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
    }


    public BankAccount() {
        this(56789, 2.50, "Default name", "Default Address", "Default phone");
        System.out.println("Empty constructor called");
    } // BankAccount constructor


    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {

        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    } // BankAccount constructor, overloaded


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double depositAmount) {

        balance += depositAmount;
        System.out.println("Deposit amount: " + depositAmount + " - Deposit processed, new balance: " + balance);

    } // depositFunds method

    public void withdrawFunds(double withdrawAmount) {

        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Withdrawal amount: " + withdrawAmount + " - Withdrawal processed, new balance: " + balance);
        } else {
            System.out.println("Withdrawal amount: " + withdrawAmount + " - Withdrawal failed, your account balance is " + balance);

        }

    } // withdrawFunds method


} // BankAccount class
