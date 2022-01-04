package com.agrgic.Lessons.Section7.L97OOPMasterChallengeExercise;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger();
        hamburger.totalPrice();
        hamburger.addLettuce();
        hamburger.addTomato();
        hamburger.addCarrot();
        hamburger.addBacon();
        hamburger.printOrder();
        hamburger.basePrice();
        hamburger.showAdditions();

        System.out.println("\r");

        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.getName());
        healthyBurger.addSeeds();
        healthyBurger.addBacon();
        healthyBurger.addBeans();
        healthyBurger.addLettuce();
        healthyBurger.printOrder();
        healthyBurger.totalPrice();
        healthyBurger.basePrice();
        healthyBurger.showAdditions();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getName());
        deluxeBurger.addBacon();
        deluxeBurger.printOrder();
        deluxeBurger.basePrice();
        deluxeBurger.totalPrice();
        deluxeBurger.showAdditions();

    } // main method

} // Main class
