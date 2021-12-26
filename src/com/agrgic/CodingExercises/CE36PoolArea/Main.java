package com.agrgic.CodingExercises.CE36PoolArea;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4.20, 6.9);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());

        System.out.println("\r");

        Cuboid cuboid = new Cuboid(5.25, 10, 2);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.area = " + cuboid.getArea());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());

    } // main method

} // Main class
