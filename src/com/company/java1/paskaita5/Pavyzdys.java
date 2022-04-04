package com.company.java1.paskaita5;

public class Pavyzdys {

    public static void main(String[] args) {
        atspausdinkJeiNelyginis(3);
        atspausdinkJeiNelyginis(2);
    }

    public static void atspausdinkJeiNelyginis(int skaicius) {
        if (skaicius % 2 == 0) {
            return;
        }

        System.out.println(skaicius);
    }
}
