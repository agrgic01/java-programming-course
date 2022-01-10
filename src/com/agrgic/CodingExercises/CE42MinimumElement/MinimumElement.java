package com.agrgic.CodingExercises.CE42MinimumElement;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        int[] array = MinimumElement.readElements(MinimumElement.readInteger());
        System.out.println("Minimum Element Value = " + MinimumElement.findMin(array));

    } //main method


    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Count: ");
        return scanner.nextInt();

    } //readInteger method


    private static int[] readElements(int count) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            System.out.print("Enter number #" + j + ": ");
            array[i] = scanner.nextInt();
        }

        return array;

    } //readElements method


    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int j : array) {
            if (j < min)
                min = j;
        }

        return min;

    } //findMin method

} //MinimumElement class