package com.agrgic.Lessons.L79ConstructorsPart1;

public class VipCustomer {


    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer() {
        this("Default Name", 100_000, "default@email.com");
    }


    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }


    public VipCustomer(String name, double creditLimit, String email) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

    } // VipCustomer constructor


    //GETTERS
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


} // VipCustomer class
