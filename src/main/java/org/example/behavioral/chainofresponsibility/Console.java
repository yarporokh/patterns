package org.example.behavioral.chainofresponsibility;

public class Console extends Printer {
    @Override
    void printMessage(String message) {
        System.out.println("Print in console: " + message);
    }
}
