package com.agrgic.Lectures.Section8.L105L106L107ListAndArrayList;

import java.util.Scanner;

public class ResizingArray {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];


    public static void main(String[] args) {
        System.out.println("enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
        baseData[10] = 57;
        baseData[11] = 40;
        printArray(baseData);
    } //main method


    private static void getInput() {

        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }

    } //getInput method


    private static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    } //printArray method


    public static void resizeArray() {

        int[] original = baseData;

        baseData = new int[12];

        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }

    } //resizeArray method

} //ResizingArray class
