package com.practice;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String searchedBranch) { //private because this method is used only internally in this class
        for(int i = 0; i < this.branches.size(); i++) {
            Branch foundOne = this.branches.get(i); //treat Customer as a data type
            if(foundOne.equals(searchedBranch)) {
                return foundOne;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null) {
            ArrayList<Customer> branchCustomers = foundBranch.getCustomers();
            System.out.println("Client names for " + foundBranch.getBranchName() + " branch is");
            for(int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("branchCustomer.getName() -> " + branchCustomer.getCustomerName());

                if(showTransactions) {
                    System.out.println("Transactions for " + branchCustomer.getCustomerName() + " customer is");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("Amount: " + transactions.get(j));
                    }
                }
                return true;
            }
        }
        return false;
    }

}