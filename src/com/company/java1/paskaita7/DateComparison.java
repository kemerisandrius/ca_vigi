package com.company.java1.paskaita7;

import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate zalgirioMusis = LocalDate.of(1410, 7, 15);
        LocalDate saulesMusis = LocalDate.of(1236, 9, 22);

        if (zalgirioMusis.isBefore(saulesMusis)) {
            System.out.println("Zalgirio musis ivyko anksciau");
        }

        if (zalgirioMusis.isAfter(saulesMusis)) {
            System.out.println("Zalgirio musis ivyko veliau");
        }
    }
}
