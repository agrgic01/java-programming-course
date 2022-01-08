package com.agrgic.Lectures.Section7.L94EncapsulationCodingChallenge;

public class Printer {

    /* fields */
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplexPrinter;

    /* constructor */
    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel <= 100 && tonerLevel >= 0)
            this.tonerLevel = tonerLevel;

        this.duplexPrinter = duplexPrinter;
    }

    /* getters */
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    /* methods */
    public void fillToner() {
        if (tonerLevel < 100) {
            tonerLevel = 100;
            System.out.println("Toner filled back up to full.");
        } else
            System.out.println("Toner is at full capacity already, spend ink first before filling.");
    } // fillToner method

    public void tonerStatus() {
        System.out.println("Current ink level at " + tonerLevel + "%.");
    } // tonerStatus method

    public void printPage() {
        if (duplexPrinter && tonerLevel >= 20) {
            pagesPrinted++;
            System.out.println("Page printed on both sides successfully.");
            tonerLevel = tonerLevel - 20;
            tonerStatus();
        } else if (duplexPrinter)
            System.out.println("Not enough ink, please refill toner using 'fillToner()' method.");
        else if (tonerLevel < 10)
            System.out.println("Not enough ink, please refill toner using 'fillToner()' method.");
        else {
            pagesPrinted++;
            System.out.println("Page printed successfully.");
            tonerLevel -= 10;
            tonerStatus();
        }
    } // printPage method


} // Printer class
