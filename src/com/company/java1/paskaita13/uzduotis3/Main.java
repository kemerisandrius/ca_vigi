package com.company.java1.paskaita13.uzduotis3;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Asmuo studentas1 = new Studentas("Jonas", "Jonaitis");
        Asmuo studentas2 = new Studentas("Petras", "Jonaitis");
        Asmuo studentas3 = new Studentas("Jonas", "Jonaitis");

        Asmuo destytojas = new Destytojas("Jonas", "Jonaitis");
        Asmuo destytojas1 = new Destytojas("Petras", "Petraitis");

        Asmuo[] asmenys = { studentas1, studentas2, studentas3, destytojas, destytojas1 };

        System.out.println(onlyUniqueValues(asmenys));
    }

    public static boolean onlyUniqueValues(Asmuo[] asmenys) {
        HashSet<Asmuo> unikalusAsmenys = new HashSet<>();
        unikalusAsmenys.addAll(Arrays.asList(asmenys));
        return asmenys.length == unikalusAsmenys.size();
    }
}
