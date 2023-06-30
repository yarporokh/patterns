package org.example.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Console consolePrinter = new Console();
        File filePrinter = new File();
        consolePrinter.setPrinter(filePrinter);

        consolePrinter.print("Hello world!");
    }
}
