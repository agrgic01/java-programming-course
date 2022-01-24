package com.agrgic.Lectures.Section9.L123L124Interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.answer();
    } // main method

} // Main class
