package com.practice;

public class Main {
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Class Branch. Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)

    // Customer:
    // Name, and the ArrayList of doubles.

    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch

    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions

    /*  Scheme
     *  ArrayLists: Bank ->      Branch ->       Customer
     *                           methods         blueprint
     *
     * */

    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    public static void main(String[] args) {
            Bank bank = new Bank("National Australia Bank");
            System.out.println(bank.getBankName());

            //doesnt work?
            bank.addingBranch("Adelaide");
            for(int i = 0; i < bank.getBranches().size(); i++)
                System.out.println(bank.getBranches().get(i).getBranchName());


            bank.addingCustomer("Adelaide", 50.05);
            bank.addingCustomer("Danila", 175.34);
            bank.addingCustomer("Max", 220.12);

            bank.addTransaction("Adelaide", 44.22);
            bank.addTransaction("Danila", 12.44);
            bank.addTransaction("Max", 1.65);

            bank.showCustomers("Adelaide");
    }
}
