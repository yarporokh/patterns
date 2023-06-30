package org.example.behavioral.visitor;

public class ConcreteVisitor implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("Visitor is performing operation on " + element.operationA());
    }

    public void visit(ConcreteElementB element) {
        System.out.println("Visitor is performing operation on " + element.operationB());
    }
}
