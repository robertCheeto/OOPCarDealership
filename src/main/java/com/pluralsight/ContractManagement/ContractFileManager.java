package com.pluralsight.ContractManagement;

import com.pluralsight.DealershipManagement.Dealership;
import com.pluralsight.DealershipManagement.Vehicle;

import java.io.*;

public class ContractFileManager {
    Dealership dealership;
    Vehicle vehicle;

    public static SalesContract getSalesContracts() {
        SalesContract salesContract = null;

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/contracts.csv"));

            String input;

            while ((input = bufReader.readLine()) != null) {
                String[] parsedList = input.split("\\|");

                if (parsedList[0].equals("SALE")) {
                    String contractType = parsedList[0];
                    String contractDate = parsedList[1];
                    String customerName = parsedList[2];
                    String customerEmail = parsedList[3];
                    int vin = Integer.parseInt(parsedList[4]);
                    int year = Integer.parseInt(parsedList[5]);
                    String make = parsedList[6];
                    String model = parsedList[7];
                    String vehicleType = parsedList[8];
                    String color = parsedList[9];
                    int mileage = Integer.parseInt(parsedList[10]);
                    double price = Double.parseDouble(parsedList[11]);
                    double salesTax = Double.parseDouble(parsedList[12]);
                    int recordingFee = Integer.parseInt(parsedList[13]);
                    int processingFee = Integer.parseInt(parsedList[14]);
                    double totalPrice = Double.parseDouble(parsedList[15]);
                    String isFinanced = parsedList[16];
                    double monthlyPayment = Double.parseDouble(parsedList[17]);

                    salesContract = new SalesContract(contractType, contractDate, customerName, customerEmail,
                            vin, year, make, model, vehicleType, color, mileage, price, salesTax, recordingFee,
                            processingFee, totalPrice, isFinanced, monthlyPayment);
                }
                else {
                    System.out.println("Whoops, no sales!");
                }

            }
            bufReader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return salesContract;
    }

    public static void saveSalesContract(SalesContract salesContract, Vehicle vehicle) {
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/contracts.csv", true));
            bufWriter.write(String.format("%s|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%.2f|%.2f|%d|%d|%.2f|%s|%.2f",
                    "SALE", salesContract.getContractDate(), salesContract.getCustomerName(), salesContract.getCustomerEmail(),
                    vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(),
                    vehicle.getVehicleType(), vehicle.getColor(), vehicle.getOdometer(), vehicle.getPrice(),
                    salesContract.getSalesTax(), salesContract.getRecordingFee(), salesContract.getProcessingFee(), salesContract.getTotalPrice(),
                    salesContract.isFinanced(), salesContract.getMonthlyPayment()));

            bufWriter.newLine();

            bufWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LeaseContract getLeaseContracts() {
        LeaseContract leaseContract = null;
        Vehicle vehicle = null;

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/contracts.csv"));

            String input;

            while ((input = bufReader.readLine()) != null) {
                String[] parsedList = input.split("\\|");

                if (parsedList[0].equals("LEASE")) {
                    String contractType = parsedList[0];
                    String contractDate = parsedList[1];
                    String customerName = parsedList[2];
                    String customerEmail = parsedList[3];
                    int vin = Integer.parseInt(parsedList[4]);
                    int year = Integer.parseInt(parsedList[5]);
                    String make = parsedList[6];
                    String model = parsedList[7];
                    String vehicleType = parsedList[8];
                    String color = parsedList[9];
                    int mileage = Integer.parseInt(parsedList[10]);
                    double price = Double.parseDouble(parsedList[11]);
                    double expectedEndValue = Double.parseDouble(parsedList[12]);
                    int leaseFee = Integer.parseInt(parsedList[13]);
                    double totalPrice = Double.parseDouble(parsedList[15]);
                    double monthlyPayment = Double.parseDouble(parsedList[17]);

                    leaseContract = new LeaseContract(contractType, contractDate, customerName, customerEmail,
                            vin, year, make, model, vehicleType, color, mileage, price, expectedEndValue,
                            leaseFee, totalPrice, monthlyPayment);
                }
                else {
                    System.out.println("Whoops, no leases!");
                }
            }
            bufReader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return leaseContract;

    }

    public static void saveLeaseContract(LeaseContract leaseContract, Vehicle vehicle) {
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/contracts.csv", true));
            bufWriter.write(String.format("%s|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%.2f|%.2f|%.2f|%.2f|%.2f",
                    "LEASE", leaseContract.getContractDate(), leaseContract.getCustomerName(), leaseContract.getCustomerEmail(),
                    vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(),
                    vehicle.getVehicleType(), vehicle.getColor(), vehicle.getOdometer(), vehicle.getPrice(),
                    leaseContract.getEndingValue(), leaseContract.getLeaseFee(), leaseContract.getTotalPrice(), leaseContract.getMonthlyPayment()));

            bufWriter.newLine();

            bufWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
