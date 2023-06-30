package org.example.behavioral.memento;

public class File {
    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    private Save save;
}
