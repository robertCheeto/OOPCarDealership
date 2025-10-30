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
        boolean isRunning = true;

        while (isRunning) {
            int userInput = keyboard.nextInt();
            keyboard.nextLine();

            switch (userInput) {
                case 1:
                    System.out.println("Process 1");
                    break;
                case 2:
                    System.out.println("Process 2");
                    break;
                case 0:
                    System.out.println("Ending Program");
                    isRunning = false;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }

    }

    private void displayVehicles(Dealership dealership) {
        ArrayList<Vehicle> inventory = new ArrayList<>();

        dealership.getAllVehicles(inventory);

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i) + " ");
        }
    }

    // i'm stumped on this one tbh
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
