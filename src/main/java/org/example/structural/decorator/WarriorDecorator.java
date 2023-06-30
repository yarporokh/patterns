package org.example.structural.decorator;

public abstract class WarriorDecorator implements Warrior {
    Warrior warrior;

    public WarriorDecorator(Warrior warrior) {
        this.warrior = warrior;
    }
}
