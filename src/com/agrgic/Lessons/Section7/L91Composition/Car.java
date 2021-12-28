package com.agrgic.Lessons.Section7.L91Composition;

public class Car extends Vehicle {

    /* fields */
    private int doors;
    private int engineCapacity;

    /* constructor */
    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

} // Car class
