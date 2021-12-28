package com.agrgic.Lessons.Section7.L92CompositionPart2;

public class Bed {

    private double width;
    private double length;
    private double height;
    private boolean bedMade = false;

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
    public double bedVolume() {
        return width * length * height;
    }

    public void makeBed() {
        if (!bedMade) {
            bedMade = true;
            System.out.println("Bed has been made, good job.");
        } else {
            System.out.println("Bed is already looking good, try unmaking it first.");
        }
    }

    public void unmakeBed() {
        if (bedMade) {
            bedMade = false;
            System.out.println("Bed has been unmade, why tho...");
        } else {
            System.out.println("Bed is already unmade, how about you try to make it instead...");
        }
    }

} // Bed class
