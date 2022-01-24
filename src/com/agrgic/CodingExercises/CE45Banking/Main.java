package com.agrgic.CodingExercises.CE45Banking;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Alen", 500.00);
        System.out.println(customer.getName());
        customer.addTransaction(100.54);
        System.out.println(customer.getTransactions());

        System.out.println("\r");

        Branch registration = new Branch("User Registration");
        System.out.println(registration.getName());
        registration.newCustomer("Habibi", 10_000.42);
        registration.newCustomer("Habibi", 400);
        registration.newCustomer("Alen", 420);
        registration.addCustomerTransaction("Alen", 100);
        System.out.println(registration.getCustomers().get(1).getTransactions());

        /*System.out.println("\r");

        Branch newBranch = new Branch("newBranch");
        System.out.println(newBranch.getName());
        newBranch.newCustomer("Bob", 100);
        ArrayList<Customer> testArray = newBranch.getCustomers();
        System.out.println(testArray.get(0).getName());
        System.out.println(testArray.get(0).getTransactions());*/
    }

}
