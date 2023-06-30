package org.example.creational.abstractfactory;

public class MedievalFactory implements WeaponFactory {
    @Override
    public MeleeWeapon getMeleeWeapon() {
        return new Sword();
    }

    @Override
    public RangeWeapon getRangeWeapon() {
        return new Crossbow();
    }
}
