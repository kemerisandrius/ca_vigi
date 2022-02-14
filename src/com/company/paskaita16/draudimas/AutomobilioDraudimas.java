package com.company.paskaita16.draudimas;

public class AutomobilioDraudimas extends Draudimas {
    private String automobilioValstybiniaiNr;

    public AutomobilioDraudimas(String apdraustojoVardas, double draudimoSuma, String automobilioValstybiniaiNr) {
        super(apdraustojoVardas, draudimoSuma);
        this.automobilioValstybiniaiNr = automobilioValstybiniaiNr;
    }

    public String getAutomobilioValstybiniaiNr() {
        return automobilioValstybiniaiNr;
    }
}
