package com.pluralsight.vehicles;

import java.util.List;

public class Vehicles {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setCargoCapacity(2);
        slowRide.setNumberOfPassengers(2);
        slowRide.setWheels();

        System.out.println(slowRide);

        Car newCar = new Car();
        System.out.println(newCar);
    }
}
