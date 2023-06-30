package org.example.creational.abstractfactory;

interface WeaponFactory {
    MeleeWeapon getMeleeWeapon();
    RangeWeapon getRangeWeapon();
}
