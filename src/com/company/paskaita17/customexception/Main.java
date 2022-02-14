package com.company.paskaita17.customexception;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("LT1", 10);
        BankAccount account2 = new BankAccount("LT2", 0);

        System.out.println(account1);
        System.out.println(account2);

        account1.transferMoney(account2, 15);

        System.out.println(account1);
        System.out.println(account2);
    }

}
