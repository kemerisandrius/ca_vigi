package com.company.paskaita8.compositionexample;

public class Daiktas {
    private String pavadinimas;
    private int kiekis;
    private double kaina;

    public Daiktas(String pavadinimas, int kiekis, double kaina) {
        this.pavadinimas = pavadinimas;
        this.kiekis = kiekis;
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public int getKiekis() {
        return kiekis;
    }

    public double getKaina() {
        return kaina;
    }
}
