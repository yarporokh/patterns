package org.example.structural.decorator;

public class Knight extends WarriorDecorator {
    public Knight(Warrior warrior) {
        super(warrior);
    }

    @Override
    public void fight() {
        warrior.fight();
        System.out.println("Crit!");
    }
}
