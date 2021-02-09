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

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String addingBranch(String newBranchName) {
        if(findBranch(newBranchName) < 0) {
            Branch newBranch = new Branch(newBranchName); //because it is much easier
//            this.branches.add(newBranch);
            return newBranchName;
        } else return "Was not successfull";
    }

    public boolean addCustomerWithInitTrans(String customerName, double initAmount) {
        Customer customer = new Customer(customerName);
        customer.getTransactions().add(initAmount);
        return true;
    }

    public boolean addTransaction(String existingCustomer, double addTrans) {
        Branch tempBranch = new Branch("Created to find Customer");
        int index = tempBranch.findCustomer(existingCustomer);
        if(index >= 0) {
            tempBranch.addingTransaction(tempBranch.getCustomers().get(index), addTrans);
            return true;
        }
        return false;
    }

    //doesnt work?
    public void listingCustomers(String branchNumber) {
        int index = findBranch(branchNumber);
        if(index >= 0){
            Bank temp = new Bank("");
            for(int i = 0; i < temp.getBranches().size(); i++)
                System.out.println(temp.branches.get(index).getCustomers());
        }
    }

    public int findBranch(String searchedBranch) {
        for(int i = 0; i < branches.size(); i++) {
            if(searchedBranch == branches.get(i).getBranchName())
                return i;
        }
        return -1;

    }
}