package com.agrgic.CodingExercises.CE38Encapsulation;

public class Printer {

    /* fields */
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    /* constructor */
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    /* getter */
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    /* methods */
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100)
                return -1;
            else
                return tonerLevel += tonerAmount;
        } else
            return -1;
    } // addToner method

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(duplex) {
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

        pagesPrinted += pages;
        return pages;
    } // printPages method


} // Printer class
