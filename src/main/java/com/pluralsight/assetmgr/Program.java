package com.pluralsight.assetmgr;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        Asset house1 = new House("Ajith's House", "10-20-2025", 500000.99, "2020 Melbourne DR", 5, 45000, 23);
        Asset car1 = new Vehicle("Ajith's whip", "5-5-2025", 69450.95, "Honda Civic Type R", 2025, 8450);

        assets.add(house1);
        assets.add(car1);
        System.out.println(house1.getValue());
        System.out.println((car1.getValue()));
    }
}
