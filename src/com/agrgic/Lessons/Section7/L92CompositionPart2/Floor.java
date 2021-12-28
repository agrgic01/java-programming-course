package com.agrgic.Lessons.Section7.L92CompositionPart2;

public class Floor {

    private double width;
    private double length;
    int cleaningCounter = 0;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    /* methods */
    public double getArea() {
        return width * length;
    }

    public void cleanCarpet() {
        cleaningCounter++;
        if (cleaningCounter < 2)
            System.out.println("Carpet has been cleaned " + cleaningCounter + " time so far.");
        else
            System.out.println("Carpet has been cleaned " + cleaningCounter + " times so far.");
    }

    public void hideFloor() {
        
    }


} // Floor class
