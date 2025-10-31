package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner keyboard = new Scanner(System.in);

    private void init() {
        dealership = DealershipFileManager.getDealership();
    }

    public void display() {
        init();
        menuDisplay();
        boolean isRunning = true;

        while (isRunning) {
            int userInput = keyboard.nextInt();
            keyboard.nextLine();

            switch (userInput) {
                case 1 -> processGetByPriceRequest();
                case 2 -> processGetByMakeModelRequest();
                case 3 -> processGetByYearRequest();
                case 4 -> processGetByColorRequest();
                case 5 -> processGetByMileageRequest();
                case 6 -> processGetByVehicleTypeRequest();
                case 7 -> processGetAllVehiclesRequest();
                case 8 -> processAddVehicleRequest();
                case 9 -> processRemoveVehicleRequest();
                case 99 -> System.exit(0);
                default -> System.out.println("Invalid input, please try again.");
            }
        }
    }

    public void menuDisplay() {
        System.out.println("*** Select Option via Number Input ***");
        System.out.println("1 - Find vehicles within a price range\n" +
                "2 - Find vehicles by make / model\n" +
                "3 - Find vehicles by year range\n" +
                "4 - Find vehicles by color\n" +
                "5 - Find vehicles by mileage range\n" +
                "6 - Find vehicles by type (car, truck, SUV, van)\n" +
                "7 - List ALL vehicles\n" +
                "8 - Add a vehicle\n" +
                "9 - Remove a vehicle\n" +
                "99 - Quit");
        System.out.print("Enter user choice here: ");
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("Printing out vehicle inventory below...");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processGetByPriceRequest() {
        System.out.println("Searching for Vehicle in Price Range...");

        System.out.print("Enter a minimum price value: $");
        int min = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println();

        System.out.print("Enter a maximum price value: $");
        int max = keyboard.nextInt();
        keyboard.nextLine();

        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest() {
        System.out.print("Enter the Vehicle Make: ");
        String make = keyboard.nextLine();

        System.out.println();

        System.out.print("Enter the Vehicle Model: ");
        String model = keyboard.nextLine();

        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }

    public void processGetByYearRequest() {
        System.out.print("Enter the oldest year the vehicle came out: ");
        int min = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter the most recent year the vehicle came out: ");
        int max = keyboard.nextInt();
        keyboard.nextLine();

        displayVehicles(dealership.getVehiclesByYear(min, max));
    }

    public void processGetByColorRequest() {
        System.out.print("Enter the color for the vehicle you wanted to search for: ");
        String color = keyboard.nextLine();

        displayVehicles(dealership.getVehiclesByColor(color));
    }

    public void processGetByMileageRequest() {
        System.out.print("Enter the minimum amount of miles on the vehicle: ");
        int min = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter the maximum amount of miles on the vehicle: ");
        int max = keyboard.nextInt();
        keyboard.nextLine();

        displayVehicles(dealership.getVehiclesByMileage(min, max));
    }

    public void processGetByVehicleTypeRequest() {
        System.out.print("Enter the vehicle type you want to search for: ");
        String vehicleType = keyboard.nextLine();

        displayVehicles(dealership.getVehiclesByType(vehicleType));
    }

    public void processGetAllVehiclesRequest() {
        displayVehicles(dealership.getAllVehicles());
    }

    public void processAddVehicleRequest() {
        //int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price
        System.out.println("Enter in vehicle information below.");
        System.out.print("Enter Vehicle VIN: ");
        int vin = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter Vehicle Year: ");
        int year = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter Vehicle Make: ");
        String make = keyboard.nextLine();

        System.out.print("Enter Vehicle Model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String type = keyboard.nextLine();

        System.out.print("Enter Vehicle Color: ");
        String color = keyboard.nextLine();

        System.out.print("Enter Mileage: ");
        int odometer = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter Listing Price: $");
        double price = keyboard.nextDouble();
        keyboard.nextLine();

        dealership.addVehicle(new Vehicle(vin, year, make, model, type, color, odometer, price));
        DealershipFileManager.saveDealership(dealership);
    }

    public void processRemoveVehicleRequest() {
        System.out.print("Enter the VIN of a Vehicle To Remove: ");
        int vin = keyboard.nextInt();
        keyboard.nextLine();

        dealership.removeVehicle(dealership.getVehiclesByVin(vin));
        DealershipFileManager.saveDealership(dealership);
    }

}
