package com.company.paskaita17.trycatch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vartotojoIvestis = scanner.nextInt();

        double rezultatas = 0;

        try {
            rezultatas = 5 / vartotojoIvestis;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Specifines klaidos");
        } catch (Exception klaida) {
            System.out.println("visos kitos klaidos");
        } finally {
            scanner.close();
        }

        System.out.println("5 / " + vartotojoIvestis + " = " + rezultatas);
    }
}
