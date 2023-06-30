package org.example.behavioral.chainofresponsibility;

abstract class Printer {
    Printer printer;

    void setPrinter(Printer printer) {
        this.printer = printer;
    }

    void print(String message) {
        printMessage(message);

        if (printer != null) {
            printer.print(message);
        }
    }

    abstract void printMessage(String message);
}
