package com.pluralsight;

import com.pluralsight.Manager.Asset;
import com.pluralsight.Manager.House;
import com.pluralsight.Manager.Vehicle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Asset> asset = new ArrayList<>();
        House house1 = new House("My house", "Nov 2021", 100000, "My address", 1, 24760, 30000);
        asset.add(house1);
        House house2 = new House("My vacation house", "Nov 2024", 800000, "My vacation address", 1, 204760, 400000);
        asset.add(house2);

        Vehicle car1 = new Vehicle("Bruce's truck", "Dec 2020", 20000, "Mercedes Bentz", 2020, 10);
        asset.add(car1);
        Vehicle car2 = new Vehicle("Wayne's car", "Dec 2025", 300000, "Bugatti Chiron", 2025, 1);
        asset.add(car2);

        try {
            for (Asset a : asset) {
                System.out.println("Description: " + a.getDescription());
                System.out.println("Date Acquired: " + a.getDateAcquired());
                System.out.println("Original Cost: $" + a.getOriginalCost());
                System.out.println("Current Value: $" + a.getValue());
                System.out.println();

                // Check type
                if (a instanceof House) {
                    House h = (House) a;  // downcast
                    System.out.println("Address: " + h.getAddress());
                    System.out.println();
                } else if (a instanceof Vehicle) {
                    Vehicle c = (Vehicle) a;  // downcast
                    System.out.println("Year/MakeModel: " + c.getYear() + " " + c.getMakeModel());
                    System.out.println();
                }
            }
        } catch (Exception e) {
                throw new RuntimeException(e);
        }
    }

}
