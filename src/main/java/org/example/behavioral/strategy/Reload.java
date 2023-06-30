package org.example.behavioral.strategy;

public class Reload implements Activity {
    @Override
    public void execution() {
        System.out.println("Reloading weapon");
    }
}
