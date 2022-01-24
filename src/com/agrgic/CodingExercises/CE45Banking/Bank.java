package com.agrgic.CodingExercises.CE45Banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public Branch findBranches(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (name == branches.get(i).getName()) {
                return branches.get(i);
            }
        }

        return null;
    }

    public boolean addBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (name == branches.get(i).getName()) {
                System.out.println("Branch Already Exists");
                return false;
            }
        }

        Branch branch = new Branch(name);
        branches.add(branch);
        System.out.println("Branch " + name + " Created");
        return true;
    }



    /*public boolean addCustomer(String branchName, String customerName, double depositAmount) {
        for (int i = 0; i < branches.size(); i++) {
            if (branchName == branches.get(i).getName()) {

            }
        }
    }*/

}
