package org.example.creational.abstractfactory;

public class Rifle implements RangeWeapon {
    @Override
    public void reload() {
        System.out.println("Insert magazine");
    }

    @Override
    public void shoot() {
        System.out.println("Pew-pew-pew-pew-pew...");
    }
}
