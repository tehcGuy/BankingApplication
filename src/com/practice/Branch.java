package com.practice;

import java.util.ArrayList;

public class Branch {
    private String newCustomer;
    private ArrayList<Customer> customers;

    public Branch(String newCustomer) {
        this.newCustomer = newCustomer;
        this.customers =  new ArrayList<>();
    }

    public boolean initialiseCustomer(Customer newCustomer){
        if(findCustomer(newCustomer.getName())>=0) {
            this.customers.add(newCustomer);
        }
        return true;
    }

    public boolean addingTransaction(Customer customer, double addTransaction){
//        Double addTransactionDouble = addTransaction; //uncomment if you want to cast into Double
        if(findCustomer(customer.getName()) >=0 ) {
            customer.getTransactions().add(addTransaction); // adding a new transaction
            return true;
        }
        return false;
    }

    public int findCustomer(String searchedCustomer){
        for(int i = 0; i < customers.size(); i++){
            if (searchedCustomer == customers.get(i).getName())
                return i;
        }
        return -1;
    }


}
