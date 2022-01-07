package com.agrgic.Lessons.Section8.L100ArraysChallengeExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

        sortIntegers(myIntegers);

    } //main method


    public static int[] getIntegers(int number) {

        System.out.println("Element " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;

    } //getIntegers method


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", has a value of " + array[i]);
        }

    } //printArray method


    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
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


} //Main class
