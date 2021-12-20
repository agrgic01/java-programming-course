package com.agrgic.CodingExercises.CE33CarpetCostCalculator;

public class Floor {

    /* fields */
    private double width;
    private double length;


    /* constructor */
    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }


    /* method */
    public double getArea() {
        return width * length;
    }


} // Floor class
