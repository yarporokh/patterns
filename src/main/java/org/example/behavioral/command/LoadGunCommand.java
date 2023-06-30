package org.example.behavioral.command;

public class LoadGunCommand implements Command {
    Weapon weapon;

    public LoadGunCommand(Weapon weapon) {
        this.weapon = weapon;
    }


    @Override
    public void execute() {
        weapon.loadGun();
    }
}
