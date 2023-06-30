package org.example.creational.abstractfactory;

public class Crossbow implements RangeWeapon {

    @Override
    public void reload() {
        System.out.println("Insert arrow");
    }

    @Override
    public void shoot() {
        System.out.println("Peeeeew...");
    }
}
