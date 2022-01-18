package com.agrgic.Lectures.Section8.L113L114L115AutoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String customerName) {
        this.name = customerName;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);

            if (checkedCustomer.getName().equals(customerName))
                return checkedCustomer;
        }

        return null;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            System.out.println("Customer " + customerName + " added.");
            return true;
        }

        return false;
    }

    public boolean addTransactions(String customerName, double transactionAmount) {
        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer != null) {
            System.out.println("Transaction amount: " + transactionAmount + " added.");
            existingCustomer.addTransaction(transactionAmount);
            return true;
        }

        System.out.println("Customer name " + " not found.");
        return false;
    }




} //Branch class
