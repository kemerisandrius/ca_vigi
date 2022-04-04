package com.company.java1.paskaita7;

import java.time.LocalTime;
import java.util.Scanner;

public class TextToDateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dateInput = scanner.next();

        //is ivesties paversti i LocalTime / LocalDateTime / LocalDate objektus
        LocalTime localTime = LocalTime.parse(dateInput);

        System.out.println(localTime.plusHours(12));

        scanner.close();
    }
}
