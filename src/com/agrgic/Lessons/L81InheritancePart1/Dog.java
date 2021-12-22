package com.agrgic.Lessons.L81InheritancePart1;

public class Dog extends Animal {


    /* fields */
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    /* constructor */
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;

    }


    /* methods */
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }


} // Dog class
