package org.example.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        Burger hamburger = new Hamburger();
        Burger cheeseburger = new Cheeseburger();

        hamburger.burger();
        System.out.println("------------------------------------------");
        cheeseburger.burger();
    }
}
