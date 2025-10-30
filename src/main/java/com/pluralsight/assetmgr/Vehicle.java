package com.pluralsight.assetmgr;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    private int carAge() {
        int currentYear = 2025;
        int carAge = currentYear - getYear();
        return carAge;
    }

    @Override
    public double getValue() {
        int currentYear = 2025;
        int carAge = currentYear - getYear();
        double value;
        if (carAge <= 3) {
            value = getOriginalCost() * (carAge * .97);
        } else if (carAge() >= 4 && carAge() <= 6) {
            value =  getOriginalCost() * (carAge * (1-.06));
        } else if (carAge() >= 7 && carAge() <= 10) {
            value = getOriginalCost() * (carAge * (1-.08));
        } else {
            value = getOriginalCost() - 1000;
        }
        if (odometer > 100000 && (!makeModel.contains("Toyota") || !makeModel.contains("Honda"))) {
            value = value * .75;
        }
        return value;
    }


}
