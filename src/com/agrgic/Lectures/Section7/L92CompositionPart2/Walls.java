package com.agrgic.Lectures.Section7.L92CompositionPart2;

public class Walls {

    private int numberOfWalls;
    private String color;
    private double height;
    int pictureCounter = 0;

    public Walls(int numberOfWalls, String color, double height) {
        this.numberOfWalls = numberOfWalls;
        this.color = color;
        this.height = height;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    /* methods */
    public void wallsDescription() {
        System.out.println("This room has " + numberOfWalls + " walls of color " + color + " and their height is " + height + ".");
    }

    public void hangPicture(int amount) {

        if (amount <= 0)
            amount = 1;

        pictureCounter += amount;

        if (pictureCounter < 2)
            System.out.println("There is " + pictureCounter + " picture hanging on the walls of our bedroom so far.");
        else
            System.out.println("There are " + pictureCounter + " pictures hanging on the walls of our bedroom so far.");

    } // hangPicture method


} // Walls class
