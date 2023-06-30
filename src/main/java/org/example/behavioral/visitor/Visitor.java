package org.example.behavioral.visitor;

public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
