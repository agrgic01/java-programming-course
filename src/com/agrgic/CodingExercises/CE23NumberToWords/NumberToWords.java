package com.agrgic.CodingExercises.CE23NumberToWords;

public class NumberToWords {


    public static void numberToWords(int number) {

        String addZero = "";
        int saveInitial = getDigitCount(number);
        number = reverse(number);

        if (saveInitial != getDigitCount(number)) {
            for (int i = getDigitCount(number); i < saveInitial; i++) {
                addZero += "Zero ";
            }
        }

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        } else if (number == 0)
            System.out.println("Zero");

        String word = "Zero";

        while (number > 0) {

            int lastDigit = number % 10;
            switch (lastDigit) {
                case 0 -> word = "Zero";
                case 1 -> word = "One";
                case 2 -> word = "Two";
                case 3 -> word = "Three";
                case 4 -> word = "Four";
                case 5 -> word = "Five";
                case 6 -> word = "Six";
                case 7 -> word = "Seven";
                case 8 -> word = "Eight";
                case 9 -> word = "Nine";
            }

            System.out.println(word);
            number /= 10;
        }

        System.out.print(addZero);

        /**/

    } // numbersToWords method


    public static int reverse(int number) {

        int reverseNumber = 0;

        if (number < 0) {
            number *= -1;
            while (number > 0) {
                int lastDigit = number % 10;
                reverseNumber = reverseNumber * 10 + lastDigit;
                number /= 10;
            }
            reverseNumber *= -1;
        } else {
            while (number > 0) {
                int lastDigit = number % 10;
                reverseNumber = reverseNumber * 10 + lastDigit;
                number /= 10;
            }
        }

        return reverseNumber;

    } // reverse method


    public static int getDigitCount(int number) {

        if (number < 0)
            return -1;

        int digits = 0;

        while (number > 0) {
            number /= 10;
            digits++;
        }

        if (digits == 0)
            digits++;

        return digits;

    } // getDigitCount method


} // NumberToWords class