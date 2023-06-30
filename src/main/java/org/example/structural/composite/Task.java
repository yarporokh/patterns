package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private List<Action> actions = new ArrayList<>();

    public void addAction(Action action) {
        actions.add(action);
    }

    public void removeAction(Action action) {
        actions.remove(action);
    }

    public void doTask() {
        System.out.println("Start to do task");

        for (Action act: actions) {
            act.execute();
        }
    }
}
