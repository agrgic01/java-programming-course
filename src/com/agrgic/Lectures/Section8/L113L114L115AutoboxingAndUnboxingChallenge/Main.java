package com.agrgic.Lectures.Section8.L113L114L115AutoboxingAndUnboxingChallenge;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Alen", 100.23);
        bank.addCustomer("Adelaide", "Tim", 50.42);
        bank.addCustomer("Adelaide", "Mike", 123.32);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.45);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.22);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.21))
            System.out.println("Error Melbourne Branch does not exist");

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists.");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 42.23))
            System.out.println("Customer does not exist at branch");

        if(!bank.addCustomer("Adelaide", "Tim", 12.21))
            System.out.println("Customer Tim already exists");
    }

} //Main class
