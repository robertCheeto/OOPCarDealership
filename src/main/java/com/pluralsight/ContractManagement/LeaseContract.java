package com.pluralsight.ContractManagement;

public class LeaseContract extends Contract {
    private double endingValue, leaseFee;

    public LeaseContract(String contractDate, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment, double endingValue, double leaseFee) {
        super(contractDate, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.endingValue = endingValue;
        this.leaseFee = leaseFee;
    }

    public double getEndingValue() {
        return endingValue;
    }

    public void setEndingValue(double endingValue) {
        this.endingValue = endingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
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
