package com.company.java1.paskaita12.uzduotis3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Asmuo asmuo = new Asmuo("Antanas", "Antanaitis");
        System.out.println(asmuo);

        List<Asmuo> asmenuSarasas = List.of(new Asmuo("Petras", "Petraitis"), new Asmuo("Tadas", "Tadaitis"));

        System.out.println(asmenuSarasas);
    }
}
