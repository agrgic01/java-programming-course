package com.agrgic.CodingExercises.CE28PaintJob;

public class Main {


    public static void main(String[] args) {

        // test values, getBucketCount method with 4 parameters
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));

        // test values, getBucketCount method with 3 parameters (overloaded #1)
        System.out.println("\r");
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(2.5, 3.76, 2));

        // test values, getBucketCount method with 2 parameters (overloaded #2)
        System.out.println("\r");
        System.out.println(PaintJob.getBucketCount(3.4, 1.5));

    } // main method


} // Main class
