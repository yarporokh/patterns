package org.example.behavioral.command;

public class InsertMagazineCommand implements Command{
    Weapon weapon;

    public InsertMagazineCommand(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void execute() {
        weapon.insertMagazine();
    }
}
