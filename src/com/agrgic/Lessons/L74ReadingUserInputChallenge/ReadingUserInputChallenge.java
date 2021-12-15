package com.agrgic.Lessons.L74ReadingUserInputChallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;

        while (counter <= 10) {

            System.out.println("Enter number #" + counter + ": ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else
                System.out.println("Invalid Number");

            scanner.nextLine(); // handle end of line (enter key)

        }

        System.out.println("Sum = " + sum);
        scanner.close();

    } // main method


} // ReadingUserInputChallenge class
