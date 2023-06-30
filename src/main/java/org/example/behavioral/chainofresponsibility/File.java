package org.example.behavioral.chainofresponsibility;

public class File extends Printer {
    @Override
    void printMessage(String message) {
        System.out.println("Print in file: " + message);
    }
}
