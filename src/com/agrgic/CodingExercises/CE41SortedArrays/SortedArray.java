package com.agrgic.CodingExercises.CE41SortedArrays;

import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int size) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter " + size + " numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;

    } //getIntegers method


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }

    } //printArray method:


    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = new int[array.length];

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;

    } //sortIntegers method


} //SortedArray class
