package com.agrgic.CodingExercises.CE36PoolArea;

public class Rectangle {

    /* fields */
    private double width;
    private double length;

    /* constructor */
    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    /* getters */
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

} // Rectangle class
