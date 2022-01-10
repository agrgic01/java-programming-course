package com.agrgic.CodingExercises.CE43ReverseArray;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        reverse(array);

    } //main method


    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        int maxValue = array.length - 1;
        int halfArray = array.length / 2;

        for (int i = 0; i < halfArray; i++) {
            int temp = array[i];
            array[i] = array[maxValue - i];
            array[maxValue - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));

    } //reverse method

} //ReverseArray class
