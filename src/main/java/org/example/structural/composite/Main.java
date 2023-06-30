package org.example.structural.composite;

public class Main {
    public static void main(String[] args) {
        Action actionOne = new ActionA();
        Action actionTwo = new ActionB();
        Task task = new Task();

        task.addAction(actionOne);
        task.addAction(actionTwo);
        task.addAction(actionOne);

        task.doTask();
    }
}
