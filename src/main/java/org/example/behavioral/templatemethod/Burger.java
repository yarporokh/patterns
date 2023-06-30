package org.example.behavioral.templatemethod;

abstract class Burger {
    void burger() {
        System.out.println(" ______");
        System.out.println("(______)");
        component();
        System.out.println("(______)");
    }

    abstract void component();
}
