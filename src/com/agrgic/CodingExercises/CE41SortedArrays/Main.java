package com.agrgic.CodingExercises.CE41SortedArrays;

public class Main {


    public static void main(String[] args) {

        int[] myArray = SortedArray.getIntegers(0);

        SortedArray.printArray(myArray);
        SortedArray.printArray(SortedArray.sortIntegers(myArray));

    } //main method


} //Main class
