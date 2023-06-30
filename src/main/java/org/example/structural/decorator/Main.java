package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Knight(new Villager());

        warrior.fight();
    }
}
