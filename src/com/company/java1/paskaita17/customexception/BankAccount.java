package com.company.java1.paskaita17.customexception;

public class BankAccount {

    private String accountNumber;
    private double amount;

    public BankAccount(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void transferMoney(BankAccount account, double amount) {
        if (this.amount <= amount) {
            throw new NotEnoughMoneyException("Account: " + this.accountNumber + " does not have enough money");
        }
        account.amount += amount;
        this.amount -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
            "accountNumber='" + accountNumber + '\'' +
            ", amount=" + amount +
            '}';
    }
}
