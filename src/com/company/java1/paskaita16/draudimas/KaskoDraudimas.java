package com.company.java1.paskaita16.draudimas;

public class KaskoDraudimas extends AutomobilioDraudimas {
    private double francize;

    public KaskoDraudimas(String apdraustojoVardas, double draudimoSuma, String automobilioValstybiniaiNr, double francize) {
        super(apdraustojoVardas, draudimoSuma, automobilioValstybiniaiNr);
        this.francize = francize;
    }

    public double getFrancize() {
        return francize;
    }
}
