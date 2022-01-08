package com.agrgic.Lectures.Section7.L97OOPMasterChallengeExercise;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean bacon;

    public Hamburger(String name) {
        this.name = name;
        this.breadRollType = "Ciabatta Roll";
        this.meat = "Ground Beef";
        this.price = 6;
    }

    public Hamburger(String name, String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = 5;
        this.meat = "Ground Beef";
    }

    public Hamburger() {
        this.name = "Hamburger";
        this.breadRollType = "Ciabatta Roll";
        this.meat = "Ground Beef";
        this.price = 3;
        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.bacon = false;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void addLettuce() {
        lettuce = true;
        price += 0.5;
        System.out.println("Lettuce has been added to your " + name + ". Current price: " + price + "$");
    }

    public void addTomato() {
        tomato = true;
        price += 0.5;
        System.out.println("Tomato has been added to your " + name + ". Current price: " + price + "$");
    }

    public void addCarrot() {
        carrot = true;
        price += 0.5;
        System.out.println("Carrot has been added to your " + name + ". Current price: " + price + "$");
    }

    public void addBacon() {
        bacon = true;
        price += 0.5;
        System.out.println("Bacon has been added to your " + name + ". Current price: " + price + "$");
    }

    public void addAdditionToPrice() {
        price += 0.5;
    }

    public void printOrder() {
        String order = "Your " + name + " consists of: " + breadRollType + ", " + meat;
        if(lettuce)
            order += ", Lettuce";
        if(tomato)
            order += ", Tomato";
        if(carrot)
            order += ", Carrot";
        if(bacon)
            order += ", Bacon";

        System.out.println(order);
    }

    public void basePrice() {
        System.out.println("Base price of " + getName() + " is 3$");
    }

    public void totalPrice() {
        System.out.println("Total Price of your " + getName() + " is " + price + "$");
    }

    public void showAdditions() {
        System.out.println("Additions added to your " + getName() + " so far: ");
        if(lettuce)
            System.out.println("Lettuce: 0.5$");
        if(tomato)
            System.out.println("Tomato: 0.5$");
        if(carrot)
            System.out.println("Carrot: 0.5$");
        if(bacon)
            System.out.println("Bacon: 0.5$");
    }

} // Hamburger class
