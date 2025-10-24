package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

public class Dealership {
    private String name, address, phone;
    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(min, max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(make, model) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(min, max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(color) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(min, max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(vehicleType) {
        return null;
    }

    // not sure if this code will work. need to build more of the program to be able to test it
    public void getAllVehicles(ArrayList<Vehicle>) {

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
        
    }

    public void addVehicle(Vehicle) {
        // need code that gets the Vehicle information before it can be added to the inventory.csv
            try {
                BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/inventory.csv",true));
                String input = "";
                inventory.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    public void removeVehicle(Vehicle) {

    }


}
