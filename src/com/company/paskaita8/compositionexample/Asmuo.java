package com.company.paskaita8.compositionexample;

public class Asmuo {
    private String vardas;
    private String pavarde;
    private Daiktas daiktas;

    public Asmuo(String vardas, String pavarde, Daiktas daiktas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.daiktas = daiktas;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public Daiktas getDaiktas() {
        return daiktas;
    }
}
