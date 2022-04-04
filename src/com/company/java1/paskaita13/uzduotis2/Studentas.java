package com.company.java1.paskaita13.uzduotis2;

public class Studentas extends Asmuo {

    public Studentas(String vardas, String pavarde) {
        super(vardas, pavarde);
    }

    @Override
    public void spausdinkInformacija() {
        System.out.println(String.format("Studento vardas: %s, pavarde: %s", vardas, pavarde));
    }
}
