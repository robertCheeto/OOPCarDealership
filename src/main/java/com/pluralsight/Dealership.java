package com.pluralsight;

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

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<Vehicle> getVehiclesByPrice(int min, int max) {
        return this.inventory;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return new ArrayList<>();
    }

    public List<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.inventory.remove(vehicle);
    }

}
