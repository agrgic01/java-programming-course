package com.agrgic.CodingExercises.CE34ComplexOperation;

public class ComplexNumber {


    /* fields */
    private double real;
    private double imaginary;


    /* constructor */
    public ComplexNumber(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;

    }


    /* getters */
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


    /* methods */
    public void add(double real, double imaginary) {

        this.real += real;
        this.imaginary += imaginary;

    }

    public void add(ComplexNumber complexNumber) {

        real += complexNumber.real;
        imaginary += complexNumber.imaginary;

    }

    public void subtract(double real, double imaginary) {

        this.real -= real;
        this.imaginary -= imaginary;

    }

    public void subtract(ComplexNumber complexNumber) {

        real -= complexNumber.real;
        imaginary -= complexNumber.imaginary;

    }

} // ComplexNumber class
