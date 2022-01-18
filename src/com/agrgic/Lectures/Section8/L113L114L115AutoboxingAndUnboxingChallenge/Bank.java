package com.agrgic.Lectures.Section8.L113L114L115AutoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branchExisting = branches.get(i);

            if (branchExisting.getName().equals(branchName))
                return branchExisting;
        }

        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            System.out.println("Branch " + branchName + " created.");
            return true;
        }

        System.out.println("Branch " + branchName + " not found.");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addTransactions(customerName, transactionAmount);
        }

        return false;
    }

    public boolean listCustomer(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + (i + 1) + ": " + branchCustomer.getName());

                if (showTransactions) {
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    System.out.println("Transactions");
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] " + transactions.get(j));
                    }
                }
            }
            return true;
        } else
            return false;
    }

} //Bank class
