package org.example.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        SpecificMediator mediator = new SpecificMediator();
        mediator.addEmployee(new SpecificEmployee("Henry", mediator));
        mediator.addEmployee(new SpecificEmployee("Annie", mediator));
        mediator.addEmployee(new SpecificEmployee("John", mediator));

        SpecificEmployee specificEmployee = new SpecificEmployee("Kyle", mediator);
        mediator.addEmployee(specificEmployee);

        specificEmployee.sayAll();

    }
}
