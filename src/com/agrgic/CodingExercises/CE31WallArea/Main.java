package com.agrgic.CodingExercises.CE31WallArea;

public class Main {


    public static void main(String[] args) {

        Wall wall1 = new Wall(4, 3);
        System.out.println("WALL 1");
        System.out.println("Width: " + wall1.getWidth());
        System.out.println("Height: " + wall1.getHeight());
        System.out.println("Area: " + wall1.getArea());

        System.out.println("\r");

        Wall wall2 = new Wall();
        System.out.println("Wall 2");
        wall2.setWidth(12);
        wall2.setHeight(4);
        System.out.println("Width: " + wall2.getWidth());
        System.out.println("Height: " + wall2.getHeight());
        System.out.println("Area: " + wall2.getArea());


    } // main method


} // Main class