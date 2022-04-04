package com.company.java1.paskaita6.bankexample;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private String currency;
    private BigDecimal amount;

    private static int accountQuantity;

    public BankAccount(String accountNumber, String currency, BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
        accountQuantity++;
    }

    public int getAccountQuantity() {
        return accountQuantity;
    }

    public void deleteAccount() {
        accountQuantity--;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
