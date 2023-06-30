package org.example.behavioral.memento;

import java.util.Date;

public class Project {
    private String name;
    private Date date;

    public void setNameAndDate(String name) {
        this.name = name;
        this.date = new Date();
    }

    public void getProject(Save save) {
        this.name = save.getName();
        this.date = save.getDate();
    }

    public Save save() {
        return new Save(this.name, this.date);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
