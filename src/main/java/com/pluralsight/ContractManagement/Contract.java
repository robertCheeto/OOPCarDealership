package com.pluralsight.ContractManagement;

public abstract class Contract {
    private String contractDate, customerName, customerEmail, vehicleSold;
    private double totalPrice, monthlyPayment;

    public Contract(String contractDate, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment) {
        this.contractDate = contractDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public String getContractDate() {
        return contractDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
