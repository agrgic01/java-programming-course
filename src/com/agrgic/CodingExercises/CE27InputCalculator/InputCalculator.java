package com.agrgic.CodingExercises.CE27InputCalculator;

import java.util.Scanner;

public class InputCalculator {


    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
        scanner.close();


    } // inputThenPrintSumAndAverage method


} // InputCalculator class