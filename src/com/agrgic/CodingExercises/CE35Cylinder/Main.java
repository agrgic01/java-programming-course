package com.agrgic.CodingExercises.CE35Cylinder;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(10.3, 10);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getArea());

    } // main method

} // Main class
