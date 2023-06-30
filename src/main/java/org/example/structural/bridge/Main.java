package org.example.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDeveloper();
        Developer CppDeveloper = new CppDeveloper();
        Program game = new GameApp(javaDeveloper);
        Program video = new VideoApp(CppDeveloper);
        game.createProgram();
        video.createProgram();
    }
}
