package com.agrgic.CodingExercises.CE35Cylinder;

public class Cylinder extends Circle {

    /* field */
    private double height;

    /* constructor */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    /* getter */
    public double getHeight() {
        return height;
    }

    /* method */
    public double getVolume() {
        return getArea() * height;
    }

} // Cylinder class
