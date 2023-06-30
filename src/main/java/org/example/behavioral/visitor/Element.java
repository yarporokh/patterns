package org.example.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
