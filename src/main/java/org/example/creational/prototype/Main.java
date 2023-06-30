package org.example.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 34);
        PersonFactory personFactory = new PersonFactory(person);

        Person newPerson = personFactory.clonePerson();

        System.out.println(person);
        System.out.println(newPerson);

        Car car = new Car("BMW", "Blue");
        Car newCar = car.clone();

        System.out.println(car);
        System.out.println(newCar);
    }
}
