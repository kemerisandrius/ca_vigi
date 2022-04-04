package com.company.java1.paskaita21.uzduotis1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        printObjectsWithDate(LocalDate.of(2021, 2, 2), 5.0, new Object(), "Labas", 12, 'c', false);
        printObjectsWithDate(LocalDate.of(2021, 2, 2), 5, "Labas");
        printObjectsWithDate(LocalDate.of(2021, 2, 2), "Labas", 12f);
    }

    public static void printObjectsWithDate(LocalDate date, Object... objects) {
        System.out.print(date + ": ");
        for (Object object : objects) {
            System.out.print(object.toString() + ", ");
        }
        System.out.println();
    }
}
