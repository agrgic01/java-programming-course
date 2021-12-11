package com.agrgic.CodingExercises.CE20GreatestCommonDivisor;

public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int first, int second) {

        // couldn't figure out this one - rip math lol

        if (first < 10 || second < 10)
            return -1;

        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }

        return second;

    } // getGreatestCommonDivisor method


} // GreatestCommonDivisor class
