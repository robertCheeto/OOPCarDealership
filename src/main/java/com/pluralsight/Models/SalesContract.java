package com.pluralsight.Models;

public class SalesContract extends Contract {
    private int recordingFee, processingFee;
    private double salesTax;
    private boolean finance;

    public SalesContract(String contractDate, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment, int recordingFee, int processingFee, double salesTax, boolean finance) {
        super(contractDate, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.salesTax = salesTax;
        this.finance = finance;
    }

    public int getRecordingFee() {
        return recordingFee;
    }

    public int getProcessingFee() {
        return processingFee;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public boolean isFinance() {
        return finance;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }

    @Override
    public double getMonthlyPayment() {
        return super.getMonthlyPayment();
    }
}
