package com.agrgic.Lectures.Section6.L79ConstructorsPart1;

public class Constructors {


    public static void main(String[] args) {

        /*
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
        */

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmail());

        System.out.println("\r");

        VipCustomer person2 = new VipCustomer("Bob", 50_000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmail());

        System.out.println("\r");

        VipCustomer person3 = new VipCustomer("Alen", 420_000.00, "alen@alen.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmail());

    } // main method


} // Constructors class
