package com.pluralsight.vehicles;

import java.util.List;

public class Car extends Vehicle {
    private Trunk trunk;

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

}
