package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

public class DealershipFileManager {

    public static Dealership getDealership() {
        Dealership dealership = null;

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));

            String input;

            while ((input = bufReader.readLine()) != null) {
                String[] parsedList = input.split("\\|");

                if (parsedList.length > 3) {
                    int vin = Integer.parseInt(parsedList[0]);
                    int year = Integer.parseInt(parsedList[1]);
                    String make = parsedList[2];
                    String model = parsedList[3];
                    String vehicleType = parsedList[4];
                    String color = parsedList[5];
                    int odometer = Integer.parseInt(parsedList[6]);
                    double price = Double.parseDouble(parsedList[7]);

                    dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
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
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/inventory.csv", true));
            bufWriter.write(String.format("%s|%s|%s", dealership.getName(), dealership.getAddress(), dealership.getPhone()));
            bufWriter.newLine();

            for (Vehicle vehicle : dealership.getAllVehicles()) {
                bufWriter.write(String.format("%d|%d|%s|%s|%s|%s|%d|%.2f", vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(), vehicle.getVehicleType(), vehicle.getColor(), vehicle.getOdometer(), vehicle.getPrice()));
            }

            bufWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
