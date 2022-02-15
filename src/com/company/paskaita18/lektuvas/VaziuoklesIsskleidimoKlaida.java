package com.company.paskaita18.lektuvas;

public class VaziuoklesIsskleidimoKlaida extends Exception {

    private String priezastis;

    public VaziuoklesIsskleidimoKlaida(String priezastis) {
        this.priezastis = "ERROR, ERROR: " + priezastis;
    }

    public String getPriezastis() {
        return priezastis;
    }
}
