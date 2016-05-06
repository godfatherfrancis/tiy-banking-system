package tiy.banking;

import java.util.TreeMap;

/**
 * Created by Godfather on 5/6/2016.
 */
public class Bank {

    private String bankID;
    private String bankName;
    private String bankStreetAddess;
    private TreeMap<String, Customer> banknCustomers;
    private double totalMoneyAtTheBank;

    Bank() {
    }

    void addCustomer() {
    }

    void addBankAccount() {
    }

    double totalMoney(){
        return totalMoneyAtTheBank;
    }
}
