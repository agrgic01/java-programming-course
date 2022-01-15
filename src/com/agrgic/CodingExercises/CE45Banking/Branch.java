package com.agrgic.CodingExercises.CE45Banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction) {
        for (int i = 0; i < customers.size(); i++) {
            if (name == customers.get(i).getName()) {
                System.out.println("Username Already Taken.");
                return false;
            }
        }

        Customer addCustomer = new Customer(name, transaction);
        customers.add(addCustomer);
        System.out.println("Customer " + name + " Created. Transaction: " + transaction);
        return true;
    }

    public boolean addCustomerTransaction(String name, double amount) {
        for (int i = 0; i < customers.size(); i++) {
            if (name == customers.get(i).getName()) {
                //int getIndex = customers.indexOf(i);
                customers.get(i).addTransaction(amount);
                System.out.println("Transaction Completed: " + amount);
                return true;
            }
        }

        System.out.println("Customer Name Doesn't Exist.");
        return false;
    }

    public Customer findCustomer(String name) {
        for (int i = 0; i <customers.size(); i++) {
            if (name == customers.get(i).getName()) {
                return customers.get(i);
            }
        }

        return null;
    }

}
