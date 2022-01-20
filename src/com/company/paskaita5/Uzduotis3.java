package com.company.paskaita5;

import java.util.Scanner;

public class Uzduotis3 {

    public static void main(String[] args) {
        double d1 = m1();
        double d2 = m2();

        System.out.println(d1 + d2);
    }

    private static double m1() {
        return 123.5;
    }

    private static double m2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite skaičių:");
        double ivestis = scanner.nextDouble();
        scanner.close();

        return ivestis;
    }
}
