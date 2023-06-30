package org.example.behavioral.command;

public class Officer {
    Command insertMagazineCommand;
    Command loadGunCommand;
    Command shootCommand;

    public Officer(Command insertMagazineCommand, Command loadGunCommand, Command shootCommand) {
        this.insertMagazineCommand = insertMagazineCommand;
        this.loadGunCommand = loadGunCommand;
        this.shootCommand = shootCommand;
    }

    void insertMagazine() {
        insertMagazineCommand.execute();
    }

    void loadGun() {
        loadGunCommand.execute();
    }

    void shoot() {
        shootCommand.execute();
    }
}
