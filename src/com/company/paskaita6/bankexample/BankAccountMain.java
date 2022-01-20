package com.company.paskaita6.bankexample;

import java.math.BigDecimal;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("LT123123123132", "EUR", BigDecimal.valueOf(1216546548L));
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Amount: " + account.getAmount() + " " + account.getCurrency());
        System.out.println("Account quantity: " + account.getAccountQuantity());

        BankAccount account2 = new BankAccount("LT123123232322", "USD", BigDecimal.valueOf(12124566666648L));
        System.out.println("Account number: " + account2.getAccountNumber());
        System.out.println("Amount: " + account2.getAmount() + " " + account2.getCurrency());
        System.out.println("Account quantity: " + account2.getAccountQuantity());

        BankAccount account3 = new BankAccount("LT1231232135648", "RUB", BigDecimal.valueOf(5));
        System.out.println("Account number: " + account3.getAccountNumber());
        System.out.println("Amount: " + account3.getAmount() + " " + account3.getCurrency());
        System.out.println("Account quantity: " + account3.getAccountQuantity());

        BankAccount account4 = new BankAccount("LT123123561146", "PLN", BigDecimal.valueOf(3));
        System.out.println("Account number: " + account4.getAccountNumber());
        System.out.println("Amount: " + account4.getAmount() + " " + account4.getCurrency());
        System.out.println("Account quantity: " + account4.getAccountQuantity());

        account4.deleteAccount();
        System.out.println("Account quantity: " + account.getAccountQuantity());
    }
}
