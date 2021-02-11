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

    //2nd inner
    public boolean addingBranch(String branchName) {
        Branch findOne = findBranch(branchName);
        if(findOne == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    private Branch findBranch(String searchedBranch) {
        for(int i = 0; i < branches.size(); i++) {
            Branch existingOne = this.branches.get(i);
            if(existingOne.equals(searchedBranch))
                return existingOne;
        }
        return null;


    }

    //3rd inner
    public boolean addingCustomer(String customerName, double initAmount) {
        Branch customer = new Branch(customerName);
        if(customer.addingCustomer(customerName, initAmount))
            return true;
        else return false;
    }

    //4th inner
    public boolean addTransaction(String customerName, double newTransaction) {
        Branch customer = new Branch(customerName);
        if(customer.addingTransaction(customerName, newTransaction))
            return true;
        else return false;
    }

    //3rd inner
    public boolean showCustomers(String branchName) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            for(int i = 0; i < branch.getCustomers().size(); i++)
                System.out.println(branch.getCustomers().get(i).getName());
            return true;
        } else return false;
    }


}