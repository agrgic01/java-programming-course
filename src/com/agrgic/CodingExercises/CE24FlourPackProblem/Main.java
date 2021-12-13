package com.agrgic.CodingExercises.CE24FlourPackProblem;

public class Main {


    public static void main(String[] args) {
        // test falsie values
        System.out.println(FlourPacker.canPack(-1, -4, 9));
        System.out.println(FlourPacker.canPack(-10, 0, 9));
        System.out.println(FlourPacker.canPack(10, -5, 9));

        // test values
        System.out.println(FlourPacker.canPack(1, 4, 9));
        System.out.println(FlourPacker.canPack(15, 7, 9));
        System.out.println(FlourPacker.canPack(1, 0, 5));

    } // main method


} // Main class
