package org.example.creational.abstractfactory;

public class ModernFactory implements WeaponFactory {
    @Override
    public MeleeWeapon getMeleeWeapon() {
        return new Knife();
    }

    @Override
    public RangeWeapon getRangeWeapon() {
        return new Rifle();
    }
}
