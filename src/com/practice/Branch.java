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
        this.customers = new ArrayList<>();
    }

    public boolean initialiseCustomer(String name, double initAmount) {
        if(findCustomer(name) == null) {
            this.customers.add(new Customer(name, initAmount)); //initialazing a customer in the parenthesis !
            return true;
        }
        return false;
    }

    public boolean addingTransaction(String customer, double addTransaction) {
        Customer existingCustomer = findCustomer(customer);
        if(existingCustomer != null) {
            existingCustomer.getTransactions().add(addTransaction); // adding a new transaction
            return true;
        }
        return false;
    }

    private Customer findCustomer(String searchedCustomer) { //private because this method is used only internally in this class
        for(int i = 0; i < this.customers.size(); i++) {
            Customer foundOne = this.customers.get(i); //treat Customer as a data type
            if(foundOne.equals(searchedCustomer)) {
                return foundOne;
            }
        }
        return null;
    }
    //note: .equals() returns true or false but .contains() the index and wont stop the iteration

}
