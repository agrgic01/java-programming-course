package com.agrgic.Lessons.Section7.L94EncapsulationCodingChallenge;

public class Main {

    public static void main(String[] args) {

        Printer standardPrinter = new Printer(10, false);
        Printer duplexPrinter = new Printer(50, true);

        System.out.println("**Standard printer**");
        standardPrinter.tonerStatus();
        standardPrinter.printPage();
        standardPrinter.printPage();
        standardPrinter.fillToner();
        standardPrinter.printPage();
        System.out.println(standardPrinter.getPagesPrinted() + " pages printed so far.");

        System.out.println("\n**Duplex printer**");
        duplexPrinter.tonerStatus();
        duplexPrinter.printPage();
        duplexPrinter.printPage();
        duplexPrinter.printPage();
        duplexPrinter.fillToner();
        duplexPrinter.printPage();
        System.out.println(duplexPrinter.getPagesPrinted() + " pages printed so far.");


    } // main method

} // Main class

