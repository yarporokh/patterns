package org.example.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> news) {
        System.out.println("\t\t<=NEWS for " + name + "=> " + news + "\n========================================================");
    }
}
