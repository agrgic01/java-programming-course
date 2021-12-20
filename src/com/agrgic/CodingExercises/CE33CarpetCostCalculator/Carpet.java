package com.agrgic.CodingExercises.CE33CarpetCostCalculator;

public class Carpet {

    /* field */
    private double cost;


    /* constructor */
    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }


    /* method */
    public double getCost() {
        return cost;
    }


} // Carpet class
