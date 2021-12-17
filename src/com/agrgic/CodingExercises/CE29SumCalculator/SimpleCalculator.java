package com.agrgic.CodingExercises.CE29SumCalculator;

public class SimpleCalculator {


    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {

        return firstNumber;

    } // getFirstNumber method


    public double getSecondNumber() {

        return secondNumber;

    } // getSecondNumber method


    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;

    } // setFirstNumber method


    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;

    } // setFirstNumber method


    public double getAdditionResult() {

        return firstNumber + secondNumber;

    } // getAdditionResult method


    public double getSubtractionResult() {

        return firstNumber - secondNumber;

    } // getSubtractionResults method


    public double getMultiplicationResult() {

        return firstNumber * secondNumber;

    } // getMultiplicationResult method


    public double getDivisionResult() {

        return (secondNumber == 0) ? 0 : firstNumber / secondNumber;

    } // getDivisionResult method


} // SimpleCalculator class
