package com.practice;
//basic class


import java.util.ArrayList;

public class Customer {
    private String name; //could also be  = new String()
    private ArrayList<Double> transactions;

    public Customer(String name, double money) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(money);
    }

    //using the procedure in the object constructor
    public void addTransaction(double addindToAccount){
        this.transactions.add(addindToAccount); // concept of autoboxing
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
