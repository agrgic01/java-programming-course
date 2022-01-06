package com.agrgic.Lessons.Section8.L99Arrays;

public class Arrays {

    public static void main(String[] args) {

        int[] myIntArray = new int[25]; // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        myIntArray[0] = 45;
//        myIntArray[5] = 50;

        double[] doubleIntArray = new double[10];

//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);

    } // main method

    public static void printArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " value is " + array[i]);
        }

    } // printArray method

} // Arrays class
