package com.agrgic.Lessons.Section7.L97OOPMasterChallengeExercise;

public class HealthyBurger extends Hamburger {

    private boolean seeds;
    private boolean beans;

    public HealthyBurger() {
        super("Healthy Burger", "Brown Rye Bread Roll");
        this.seeds = false;
        this.beans = false;
    }

    public boolean isSeeds() {
        return seeds;
    }

    public boolean isBeans() {
        return beans;
    }

    public void addSeeds() {
        seeds = true;
        addAdditionToPrice();
        System.out.println("Seeds have been added to your " + getName() + ". Current price: " + getPrice() + "$");
    }

    public void addBeans() {
        beans = true;
        addAdditionToPrice();
        System.out.println("Beans have been added to your " + getName() + ". Current price: " + getPrice() + "$");
    }

    @Override
    public void printOrder() {
        String order = "Your " + getName() + " consists of: " + getBreadRollType() + ", " + getMeat();
        if(isLettuce())
            order += ", Lettuce";
        if(isTomato())
            order += ", Tomato";
        if(isCarrot())
            order += ", Carrot";
        if(isBacon())
            order += ", Bacon";
        if(isBeans())
            order += ", Beans";
        if(isSeeds())
            order += ", Seeds";

        System.out.println(order + "\nTotal Price: " + getPrice() + "$");
    }

    @Override
    public void basePrice() {
        System.out.println("Base price of " + getName() + " is 5$");
    }

    @Override
    public void showAdditions() {
        super.showAdditions();
        if(seeds)
            System.out.println("Seeds: 0.5$");
        if(beans)
            System.out.println("Beans: 0.5$");
    }

} // HealthyBurger class
