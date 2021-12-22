package com.agrgic.Lessons.L81InheritancePart1;

public class Fish extends Animal {


    /* fields */
    private int gills;
    private int eyes;
    private int fins;


    /* constructor */
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;

    }

    private void rest() {
    }

    private void moveMuscles() {
        System.out.println("moveMuscles() was called");
    }

    private void moveBackFin() {
        System.out.println("moveBackFin() was called");
    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

} // Fish class
