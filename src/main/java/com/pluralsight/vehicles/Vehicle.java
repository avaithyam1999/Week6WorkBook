package com.pluralsight.vehicles;

import java.util.List;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private List<Wheel> wheels;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels() {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return String.format(
                """
                Vehicle Details: %s
                Color: %s
                Number of Passengers: %d
                Cargo Capacity: %d
                Fuel Capacity: %d
                Number of wheels: %d
                """, getClass().getSimpleName(),color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels
        );
    }
}
