package com.pluralsight;

public class UserInterface {

    public static void main(String[] args) {
        Dealership dealership = new Dealership("Tony's Car Park", "1600 Pennsylavnia Avenue", "412-577-8014");

    }

    private void init() {
        DealershipFileManager dealership = new DealershipFileManager();
        dealership.getDealership();

    }

    public static void display() {
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
