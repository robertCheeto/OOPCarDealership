package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name, address, phone;
    ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByPrice(int min, int max) {
        return new ArrayList<Vehicle>();
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return new ArrayList<Vehicle>();
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return new ArrayList<Vehicle>();
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return new ArrayList<Vehicle>();
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return new ArrayList<Vehicle>();
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return new ArrayList<Vehicle>();
    }

    // not sure if this code will work. need to build more of the program to be able to test it
    public static void getAllVehicles(ArrayList<Vehicle> inventory) {
        return inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        return this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        return this.inventory.remove(vehicle);
    }


}
