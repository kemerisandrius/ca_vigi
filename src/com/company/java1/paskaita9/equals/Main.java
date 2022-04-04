package com.company.java1.paskaita9.equals;

public class Main {

    public static void main(String[] args) {

        String obuolys = "obuolys";
        String apelsinas = "apelsinas";
        String bananas = "bananas";

        String[] array1 = { obuolys, apelsinas, bananas };
        String[] array2 = { obuolys, apelsinas, bananas };

        System.out.println(array1 == array2);
        System.out.println(array1[1] == array2[1]);
    }
}
