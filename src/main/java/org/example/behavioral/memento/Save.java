package org.example.behavioral.memento;

import java.util.Date;

public class Save {
    private final String name;
    private final Date date;

    public Save(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
