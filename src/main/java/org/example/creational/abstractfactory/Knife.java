package org.example.creational.abstractfactory;

public class Knife implements MeleeWeapon {
    @Override
    public void cut() {
        System.out.println("Small swing");
    }
}
