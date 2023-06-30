package org.example.behavioral.command;

public class ShootCommand implements Command {
    Weapon weapon;

    public ShootCommand(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void execute() {
        weapon.shoot();
    }
}
