package com.agrgic.CodingExercises.CE35Cylinder;

public class Circle {

    /* field */
    private double radius;

    /* constructor */
    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    /* getter */
    public double getRadius() {
        return radius;
    }

    /* method */
    public double getArea() {
        return radius * radius * Math.PI;
    }

} // Circle class
