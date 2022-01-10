package com.agrgic.Lectures.Section8.L104ReverseArrayChallenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 22, -3, 0, 5213312};
        System.out.println("Array Original = " + Arrays.toString(array));

        reverse(array);
        System.out.println("Array Reversed = " + Arrays.toString(array));

    } //main method


    private static void reverse(int[] array) {

        int[] copyArray = new int[array.length];
        int j = 1;

        System.arraycopy(array, 0, copyArray, 0, copyArray.length);

        for (int i = 0; i < array.length; i++) {
            array[i] = copyArray[array.length - j];
            j++;
        }

    } //reverse method

} //Main class
