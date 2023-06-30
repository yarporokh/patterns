package org.example.behavioral.mediator;

public class SpecificEmployee implements Employee {
    String name;
    Mediator mediator;

    public SpecificEmployee(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello " + name);
    }

    @Override
    public void sayBye() {
        System.out.println("Bye " + name);
    }

    @Override
    public void sayAll() {
        mediator.requestAll(this);
    }
}
