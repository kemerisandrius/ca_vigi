package com.company.java1.paskaita13.uzduotis2;

public class Destytojas extends Asmuo {

    public Destytojas(String vardas, String pavarde) {
        super(vardas, pavarde);
    }

    @Override
    public void spausdinkInformacija() {
        System.out.println(String.format("Destytojo vardas: %s, pavarde: %s", vardas, pavarde));
    }
}
