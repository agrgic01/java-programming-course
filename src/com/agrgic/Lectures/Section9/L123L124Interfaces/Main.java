package com.agrgic.Lectures.Section9.L123L124Interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        System.out.println("\r");

        timsPhone = new MobilePhone(24656);
        timsPhone.powerOn();
        timsPhone.callPhone(24656);
        timsPhone.answer();
    } // main method

} // Main class
