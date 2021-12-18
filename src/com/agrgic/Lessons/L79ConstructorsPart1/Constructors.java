package com.agrgic.Lessons.L79ConstructorsPart1;

public class Constructors {


    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount(); //(123456, 0.00, "Josh Smith", "josh@email.com", "092323146");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());

        bobsAccount.depositFunds(100.0);
        bobsAccount.withdrawFunds(50.0);
        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(50000.0);
        bobsAccount.withdrawFunds(12000.0);

        System.out.println("\r");

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "094123123");

        System.out.println("account number: " + timsAccount.getAccountNumber() + " name: " + timsAccount.getCustomerName());

    } // main method


} // Constructors class
