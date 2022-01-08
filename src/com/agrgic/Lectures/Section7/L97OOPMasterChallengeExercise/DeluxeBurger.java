package com.agrgic.Lectures.Section7.L97OOPMasterChallengeExercise;

public class DeluxeBurger extends Hamburger{

    private String drink;
    private String chips;
    private String error = "Cannot add additions to Deluxe Burger.";

    public DeluxeBurger() {
        super("Deluxe Burger");
        drink = "Drink";
        chips = "Chips";
    }

    public String getDrink() {
        return drink;
    }

    public String getChips() {
        return chips;
    }

    @Override
    public void addLettuce() {
        System.out.println(error);
    }

    @Override
    public void addTomato() {
        System.out.println(error);
    }

    @Override
    public void addCarrot() {
        System.out.println(error);
    }

    @Override
    public void addBacon() {
        System.out.println(error);
    }

    @Override
    public void printOrder() {
        System.out.println("Your " + getName() + " consists of: " + getBreadRollType() + ", " + getMeat() + ", " + getDrink() + ", " + getChips());
    }

    @Override
    public void basePrice() {
        System.out.println("Base price of " + getName() + " is 6$");
    }

    @Override
    public void totalPrice() {
        super.totalPrice();
    }

    @Override
    public void showAdditions() {
        System.out.println("Additions added to your " + getName() + " are: " + getDrink() + " & " + getChips());
        System.out.println(getDrink() +  ": 1.5$");
        System.out.println(getChips() + ": 1.5$");
    }

} // DeluxeBurger class
