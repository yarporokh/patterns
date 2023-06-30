package org.example.structural.bridge;

public class VideoApp extends Program {
    protected VideoApp(Developer developer) {
        super(developer);
    }

    @Override
    public void createProgram() {
        System.out.println("Create Video Application");
        developer.writeCode();
    }
}
