package org.example.creational.factory;

public class VehicleFactory {
    public Vehicle createVehicle(String vehicle) {
        if (vehicle.equalsIgnoreCase("car")) {
            return new Car();
        } else if (vehicle.equalsIgnoreCase("bus")) {
            return new Bus();
        } else if (vehicle.equalsIgnoreCase("truck")) {
            return new Truck();
        }

        throw new RuntimeException(vehicle + " is unknown");
    }

}
