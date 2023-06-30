package org.example.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = getWeaponFactoryByPeriod("modern");

        RangeWeapon rangeWeapon = weaponFactory.getRangeWeapon();
        MeleeWeapon meleeWeapon = weaponFactory.getMeleeWeapon();

        rangeWeapon.shoot();
        meleeWeapon.cut();
    }

    private static WeaponFactory getWeaponFactoryByPeriod(String period) {
        if (period.equalsIgnoreCase("medieval")) {
            return new MedievalFactory();
        } else if (period.equalsIgnoreCase("modern")) {
            return new ModernFactory();
        }

        throw new RuntimeException(period + " is unknown");
    }
}
