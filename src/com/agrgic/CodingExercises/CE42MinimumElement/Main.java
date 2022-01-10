package com.agrgic.CodingExercises.CE42MinimumElement;

public class Main {

    public static void main(String[] args) {

        int[] array = MinimumElement.readElements(MinimumElement.readInteger());
        System.out.println("Minimum Element Value = " + MinimumElement.findMin(array));

    } //main method

} //Main class
