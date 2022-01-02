package com.agrgic.Lessons.Section7.L96PolymorphismChallenge;

public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name,int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    /* methods */
    public int topSpeed() {
        return 200;
    }

    public String engineType() {
        return "Flat Engine";
    }

    public String seatsMaterial() {
       return "Leather";
    }

} // Car class


class buba extends Car {

    public buba() {
        super("Buba", 4);
    }

    @Override
    public int topSpeed() {
        return 100;
    }

    @Override
    public String engineType() {
        return "Straight Engine";
    }

    @Override
    public String seatsMaterial() {
        return "Ultrasuede";
    }

} // buba class


class fico extends Car {

    public fico() {
        super("Fićo", 5);
    }

    @Override
    public int topSpeed() {
        return 125;
    }

    @Override
    public String engineType() {
        return "Inline Engine";
    }

    @Override
    public String seatsMaterial() {
        return "Nylon";
    }

} // fico class


class peglica extends Car {

    public peglica() {
        super("Peglica", 6);
    }

    @Override
    public int topSpeed() {
        return 75;
    }

    @Override
    public String engineType() {
        return "V Engine";
    }

    @Override
    public String seatsMaterial() {
        return "Polyester";
    }

} // peglica class


