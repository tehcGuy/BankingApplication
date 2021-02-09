package com.practice;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String branchName;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public Branch(String name) {
        this.branchName = name;
        this.customers =  new ArrayList<>();
    }

    public boolean initialiseCustomer(Customer newCustomer){
        if(findCustomer(newCustomer.getName()) < 0) {
            this.customers.add(newCustomer);
            return true;
        }
        return false;
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
