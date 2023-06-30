package org.example.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression john = new TerminalExpression("John");
        Expression robert = new TerminalExpression("Robert");
        Expression married = new OrExpression(john, robert);

        Expression julia = new TerminalExpression("Julia");
        Expression single = new TerminalExpression("Single");

        System.out.println("Is John married? " + married.interpret("John"));
        System.out.println("Is Robert married? " + married.interpret("Robert"));
        System.out.println("Is Julia single? " + single.interpret("Julia"));
        System.out.println("Is John married and Julia single? " + new AndExpression(married, single).interpret("John Julia"));
        System.out.println("Is Julia single or John married? " + new OrExpression(julia, married).interpret("Julia"));
    }
}
