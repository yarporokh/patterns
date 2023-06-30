package org.example.creational.abstractfactory;

public class Sword implements MeleeWeapon {
    @Override
    public void cut() {
        System.out.println("Big swing");
    }
}
