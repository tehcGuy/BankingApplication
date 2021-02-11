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

    //last modification
    public boolean addingBranch(String branchName) {
        Branch findOne = findBranch(branchName);
        if(findOne == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }


    private Branch findBranch(String searchedBranch) {
        for(int i = 0; i < branches.size(); i++) {
            Branch existingOne = this.branches.get(i);
            if(existingOne.equals(searchedBranch))
                return existingOne;
        }
        return null;

    }
}