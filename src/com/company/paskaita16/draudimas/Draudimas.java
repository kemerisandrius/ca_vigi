package com.company.paskaita16.draudimas;

public class Draudimas {
    private String apdraustojoVardas;
    private double draudimoSuma;

    public Draudimas(String apdraustojoVardas, double draudimoSuma) {
        this.apdraustojoVardas = apdraustojoVardas;
        this.draudimoSuma = draudimoSuma;
    }

    public String getApdraustojoVardas() {
        return apdraustojoVardas;
    }

    public double getDraudimoSuma() {
        return draudimoSuma;
    }
}
