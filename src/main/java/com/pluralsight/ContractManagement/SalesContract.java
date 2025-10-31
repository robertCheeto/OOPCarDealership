package com.pluralsight.ContractManagement;

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

    public void setRecordingFee(int recordingFee) {
        this.recordingFee = recordingFee;
    }

    public int getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
