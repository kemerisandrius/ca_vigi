package com.company.java1.paskaita13.uzduotis2;

public abstract class Asmuo {

    protected String vardas;
    protected String pavarde;

    public Asmuo(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public abstract void spausdinkInformacija();

    @Override
    public String toString() {
        return "Asmuo{" +
            "vardas='" + vardas + '\'' +
            ", pavarde='" + pavarde + '\'' +
            '}';
    }
}
