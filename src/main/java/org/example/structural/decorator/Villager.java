package org.example.structural.decorator;

public class Villager implements Warrior {
    @Override
    public void fight() {
        System.out.println("Beat");
    }
}
