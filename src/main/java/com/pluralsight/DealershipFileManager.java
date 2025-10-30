package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManager {
    ArrayList<Vehicle> inventory = new ArrayList<>();

    public static Dealership getDealership() {
        Dealership dealership = null;

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));

            String input = "";
            String[] parsedList = input.split("\\|");

            while ((input = bufReader.readLine()) != null) {

                if (parsedList.length > 3) {
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
                else {
                    String name = parsedList[0];
                    String address = parsedList[1];
                    String phoneNum = parsedList[2];

                    dealership = new Dealership(name, address, phoneNum);
                }

            }
            bufReader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }

    public static void saveDealership(Dealership dealership) {
        // need to write to inventory file
        // get dealership name, get the inventory and overwrite file



    }



}
