package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {
        InterfaceB interfaceB = new ClassB();
        SomeClass someClass = new SomeClass();
        InterfaceA interfaceA = new Adapter(new ClassB());

        someClass.someMethod(interfaceA);
    }
}
