package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner keyboard = new Scanner(System.in);
    // need to somehow return the dealership data in init() to the dealership object;

    private void init() {
        dealership = DealershipFileManager.getDealership();
    }

    // for all the switch case instances, that is where the process()s go
    // need to load those into the switch case
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
                case 7 -> processAllVehicleRequest();
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

    private void displayVehicles(Dealership dealership) {
        ArrayList<Vehicle> inventory = new ArrayList<>();

        dealership.getAllVehicles(inventory);

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i) + " ");
        }
    }

    public static void processAllVehicleRequest(Dealership dealership) {
        dealership.displayVehicles();
    }


    public static void processGetByPriceRequest() {

    }

    public static void processGetByMakeModelRequest() {

    }

    public static void processGetByYearRequest() {

    }

    public static void processGetByColorRequest() {

    }

    public static void processGetByMileageRequest() {

    }

    public static void processGetByVehicleTypeRequest() {

    }

    public static void processGetByAllVehiclesRequest() {

    }

    public static void processAddVehicleRequest() {

    }

    public static void processRemoveVehicleRequest() {

    }

}
