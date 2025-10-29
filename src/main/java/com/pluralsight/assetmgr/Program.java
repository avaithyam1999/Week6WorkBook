package com.pluralsight.assetmgr;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        Asset house1 = new House("Ajith's House", "10-20-2025", 500000.99, "2020 Melbourne Avenue", 4, 45000, 23);
        Asset house2 = new House("Suno's House", "1-1-2025", 10000000.00, "1111 King Drive", 4, 100000, 50);
        Asset car1 = new Vehicle("Ajith's whip", "5-5-2022", 69450.95, "Honda Civic Type R", 2025, 8450);
        Asset car2 = new Vehicle("Suno's whip", "6-3-2025", 100350.99, "Pawmobile 5000", 3025, 15);

        assets.add(house1);
        assets.add(house2);
        assets.add(car1);
        assets.add(car2);

        for (Asset asset : assets) {
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.printf("%s at %s\n", house.getDescription(), house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.printf("Vehicle: %s - (year: %d)\n", vehicle.getMakeModel(), vehicle.getYear());
            }
        }
    }
}
