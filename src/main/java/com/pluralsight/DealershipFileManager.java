package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManager {
    ArrayList<Vehicle> inventory = new ArrayList<>();

    public static Dealership getDealership() {

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));
            String input = "";

            while ((input = bufReader.readLine()) != null) {
                String[] parsedList = input.split("\\|");

                int vin = Integer.parseInt(parsedList[0]);
                int year = Integer.parseInt(parsedList[1]);
                String make = parsedList[2];
                String model = parsedList[3];
                String vehicleType = parsedList[4];
                String color = parsedList[5];
                int odometer = Integer.parseInt(parsedList[6]);
                double price = Double.parseDouble(parsedList[7]);

                inventory.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
            }
            bufReader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i) + " ");
        }
        return null;
    }

    public void saveDealership(Dealership dealership) {

    }



}
