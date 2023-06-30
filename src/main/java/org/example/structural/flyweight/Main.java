package org.example.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("Key1");
        flyweight1.operation();

        Flyweight flyweight2 = factory.getFlyweight("Key2");
        flyweight2.operation();

        Flyweight flyweight3 = factory.getFlyweight("Key1");
        flyweight3.operation();

        System.out.println("flyweight1 == flyweight3? " + (flyweight1 == flyweight3));
    }
}
