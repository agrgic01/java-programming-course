package com.agrgic.CodingExercises.CE33CarpetCostCalculator;

public class Main {


    public static void main(String[] args) {

        Floor floor = new Floor(12, 3);
        Carpet carpet = new Carpet(1.5);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("room area is " + floor.getArea() + " square meters");
        System.out.println("this carpet costs " + carpet.getCost() + "$ per square meter");
        System.out.println("total cost to cover the whole room: " + calculator.getTotalCost());

        System.out.println("\r");

        floor = new Floor(2.5, 16);
        carpet = new Carpet(20);
        calculator = new Calculator(floor, carpet);

        System.out.println("room area is " + floor.getArea() + " square meters");
        System.out.println("this carpet costs " + carpet.getCost() + "$ per square meter");
        System.out.println("total cost to cover the whole room: " + calculator.getTotalCost());

    } // main method


} // Main class
