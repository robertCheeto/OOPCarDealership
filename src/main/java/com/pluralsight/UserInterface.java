package com.pluralsight;

public class UserInterface {

    // need to somehow return the dealership data in init() to the dealership object
    Dealership dealership = new Dealership("", "", "");

    private Dealership init() {
        DealershipFileManager dealershipManager = new DealershipFileManager();
        dealershipManager.getDealership();

        return dealership;
    }

    public void display() {
        init();

        while (isRunning) {
            boolean isRunning;

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
