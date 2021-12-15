package com.agrgic.CodingExercises.CE26DiagonalStar;

public class DiagonalStar {


    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int rowCount = 1;

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number || j == 1 || j == number || i == j || i == number - j + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

                if (j == number) {
                    System.out.println();
                }
            }

        }

    } // printSquareStar method


} // DiagonalStar class
