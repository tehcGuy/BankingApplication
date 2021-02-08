package com.practice;
//basic class


import java.util.ArrayList;

public class Customer {
    private String name; //could also be  = new String()
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public static Customer createCustomer(String name) {
        ArrayList<Double> transactions = new ArrayList<>();
        return new Customer(name);
    }
}
