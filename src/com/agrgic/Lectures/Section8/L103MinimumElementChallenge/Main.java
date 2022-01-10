package com.agrgic.Lectures.Section8.L103MinimumElementChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(findMin(readIntegers(2)));

    } //main method


    private static int[] readIntegers(int count) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        System.out.println("Enter " + count + " integers:");

        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            System.out.print("Integer #" + j + ": ");
            array[i] = scanner.nextInt();
        }

        return array;

    } //readIntegers method


    private static int findMin(int[] array) {

        int min = array[0];

        for (int j : array) {
            if (j < min)
                min = j;
        }

        return min;

    } //findMin method

} //Main class
