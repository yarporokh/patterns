package org.example.structural.adapter;

public class Adapter implements InterfaceA {
    InterfaceB interfaceB;

    public Adapter(InterfaceB interfaceB) {
        this.interfaceB = interfaceB;
    }

    @Override
    public void optionA() {
        interfaceB.optionB();
    }
}
