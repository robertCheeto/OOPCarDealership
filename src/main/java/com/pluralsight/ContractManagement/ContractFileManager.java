package com.pluralsight.ContractManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.rmi.dgc.Lease;

public class ContractFileManager {
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

    public static LeaseContract getLeaseContracts() {
        LeaseContract leaseContract = null;

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

    public static void saveSalesContract(SalesContract salesContract) {

    }

    public static void saveLeaseContract(LeaseContract leaseContract) {

    }

}
