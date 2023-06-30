package org.example.behavioral.memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        project.setNameAndDate("Project 1.1");

        System.out.println(project);

        File file = new File();
        file.setSave(project.save());

        Thread.sleep(5000);

        project.setNameAndDate("Project 1.2");

        System.out.println(project);


        project.getProject(file.getSave());

        System.out.println(project);
    }
}
