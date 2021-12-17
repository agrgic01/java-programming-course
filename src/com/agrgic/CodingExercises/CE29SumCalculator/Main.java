package com.agrgic.CodingExercises.CE29SumCalculator;

public class Main {


    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(0);
        System.out.println(calculator.getDivisionResult());

        calculator.setFirstNumber(25);
        calculator.setSecondNumber(250);
        System.out.println(calculator.getAdditionResult());

    }


}
