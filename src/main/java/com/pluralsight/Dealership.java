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
        ArrayList<Vehicle> priceList = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if ((vehicle.getPrice() >= min) && (vehicle.getPrice() <= max)) {
                priceList.add(vehicle);
            }
        }
        return priceList;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> makeModelList = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) || vehicle.getModel().equalsIgnoreCase(model)) {
                makeModelList.add(vehicle);
            }
        }
        return makeModelList;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> yearList = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max){
                yearList.add(vehicle);
            }
        }
        return yearList;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> colorList = new ArrayList<>();
        for (Vehicle vehicle :inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                colorList.add(vehicle);
            }
        }
        return colorList;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> mileageList = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                mileageList.add(vehicle);
            }
        }
        return mileageList;
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
