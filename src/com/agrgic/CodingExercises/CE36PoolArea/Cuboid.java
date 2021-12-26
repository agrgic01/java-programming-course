package com.agrgic.CodingExercises.CE36PoolArea;

public class Cuboid extends Rectangle {

    /* field */
    private double height;

    /* constructor */
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    /* getter */
    public double getHeight() {
        return height;
    }

    /* methods */
    public double getVolume() {
        return height * getArea();
    }

} // Cuboid class
