package com.agrgic.Lessons.L77ClassesPart1;

public class Main {


    public static void main(String[] args) {

        Car posche = new Car();
        Car holden = new Car();
        holden.setModel("commodore");
        posche.setModel("911");
        System.out.println("Model is " + holden.getModel());

    } //main method


} // Main class
