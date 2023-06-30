package org.example.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SpecificMediator implements Mediator {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void requestAll(Employee employee) {
        employee.sayHello();
        for (Employee e: employees) {
            if (e != employee) {
                e.sayBye();
            }
        }
    }
}
