package com.company.java1.paskaita17.throwexample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varototojoIvestis = scanner.nextInt();

        if (varototojoIvestis < 0) {
            throw new RuntimeException("Ivestas skaicius negali buti neigiamas");
        }
    }

}
