package org.example.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        Officer officer = new Officer(
                new InsertMagazineCommand(weapon),
                new LoadGunCommand(weapon),
                new ShootCommand(weapon));

        officer.insertMagazine();
        officer.loadGun();
        officer.shoot();
        officer.shoot();
        officer.shoot();
        officer.shoot();
    }
}
