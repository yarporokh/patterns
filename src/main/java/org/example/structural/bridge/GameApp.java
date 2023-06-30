package org.example.structural.bridge;

public class GameApp extends Program {

    protected GameApp(Developer developer) {
        super(developer);
    }

    @Override
    public void createProgram() {
        System.out.println("Create Game Application");
        developer.writeCode();
    }
}
