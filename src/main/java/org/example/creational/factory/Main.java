package org.example.creational.factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.createVehicle("BUS");
        vehicle.info();
    }
}
