package com.pluralsight.ContractManagement;

import com.pluralsight.DealershipManagement.Vehicle;

import java.awt.*;

public class SalesContract extends Contract {
    Vehicle vehicle;
    private int recordingFee, processingFee;
    private double salesTax;
    private boolean financed;

    public SalesContract(String contractDate, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment, int recordingFee, int processingFee, double salesTax, boolean financed) {
        super(contractDate, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.salesTax = salesTax;
        this.financed = financed;
    }

    public int getRecordingFee() {
        return 100;
    }

    public void setRecordingFee(int recordingFee) {
        this.recordingFee = recordingFee;
    }

    public int getProcessingFee() {
        if (vehicle.getPrice() > 10000) {
            processingFee = 495;
        }
        else {
            processingFee = 295;
        }
        return processingFee;
    }

    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public double getSalesTax() {
        if (vehicle.getPrice() > 10000) {
            salesTax = 0.0425;
        }
        else {
            salesTax = 0.0525;
        }
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public boolean isFinanced() {
        return financed;
    }

    public void setFinanced(boolean financed) {
        this.financed = financed;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        salesTax = getSalesTax();
        financed = isFinanced();

        System.out.println("Add statement that asks user if they want to finance and take in that value.");
        if (financed) {
            if (vehicle.getPrice() > 10000) {
                salesTax = getSalesTax();
                double priceAfterTax = (vehicle.getPrice() - (vehicle.getPrice()) * salesTax)  + recordingFee + processingFee;
                return (priceAfterTax / 48);
            }
            else {
                salesTax = getSalesTax();
                double priceAfterTax = (vehicle.getPrice() - (vehicle.getPrice()) * salesTax)  + recordingFee + processingFee;
                return (priceAfterTax / 24);
            }
        }
        else {

            return salesTax + recordingFee + processingFee;
        }
    }
}
