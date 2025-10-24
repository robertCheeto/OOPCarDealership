package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManager {
    ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership getDealership() {

        Dealership dealership;

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));
            String input = "";

            bufReader.readLine();
            String[] parsedList1 = input.split("\\|");

            String name = parsedList1[0];
            String address = parsedList1[1];
            String phoneNum = parsedList1[2];

            dealership = new Dealership(name, address, phoneNum);

            while ((input = bufReader.readLine()) != null) {
                String[] parsedList2 = input.split("\\|");

                int vin = Integer.parseInt(parsedList2[0]);
                int year = Integer.parseInt(parsedList2[1]);
                String make = parsedList2[2];
                String model = parsedList2[3];
                String vehicleType = parsedList2[4];
                String color = parsedList2[5];
                int odometer = Integer.parseInt(parsedList2[6]);
                double price = Double.parseDouble(parsedList2[7]);

                inventory.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
            }
            bufReader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership) {

    }



}
