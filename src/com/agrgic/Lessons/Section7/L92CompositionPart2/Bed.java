package com.agrgic.Lessons.Section7.L92CompositionPart2;

public class Bed {

    private double width;
    private double length;
    private double height;

    public Bed(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    /* methods */
    private double bedVolume() {
        return width * length * height;
    }

} // Bed class
