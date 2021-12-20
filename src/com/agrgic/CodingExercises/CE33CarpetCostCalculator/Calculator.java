package com.agrgic.CodingExercises.CE33CarpetCostCalculator;

public class Calculator {

    /* fields */
    private Floor floor;
    private Carpet carpet;


    /* constructor */
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    /* method */
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }


} // Calculator class
