package com.agrgic.Lessons.L75MinAndMaxInputChallenge;

import java.util.Scanner;

public class MinMaxChallenge {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        // boolean first = true; // FLAG METHOD

        while (true) {

            System.out.println("Enter Number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

                /*if (first) {
                    first = false;
                    minValue = number;
                    maxValue = number;
                }*/ // FLAG METHOD

                if (number < minValue)
                    minValue = number;

                if (number > maxValue)
                    maxValue = number;

            } else {
                break;
            }

            scanner.nextLine(); // handle input

        }

        System.out.println("minValue = " + minValue + ", maxValue = " + maxValue);

        scanner.close();

    } // main method


} // MinMaxChallenge class
