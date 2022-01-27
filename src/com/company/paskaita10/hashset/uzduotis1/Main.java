package com.company.paskaita10.hashset.uzduotis1;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<String> aibe = new HashSet<>();
        aibe.add("a");
        aibe.add("b");
        aibe.add("c");

        System.out.println("Aibes elementai: " + aibe);
        System.out.println("Aibes dydis: " + aibe.size());

        aibe.add("b");
        System.out.println("Aibes elementai: " + aibe);
        System.out.println("Aibes dydis: " + aibe.size());

        boolean yraDRaide = aibe.contains("d");
        System.out.println("Aibeje yra d raide: " + yraDRaide);

        boolean yraBRaide = aibe.contains("b");
        if (yraBRaide) {
            aibe.remove("b");
        }
        System.out.println("Aibes elementai: " + aibe);
        System.out.println("Aibes dydis: " + aibe.size());

        aibe.clear();
        System.out.println("Aibes elementai: " + aibe);
        System.out.println("Aibes dydis: " + aibe.size());
    }

}
