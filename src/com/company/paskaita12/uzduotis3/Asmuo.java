package com.company.paskaita12.uzduotis3;

public class Asmuo {
    private String vardas;
    private String pavarde;

    public Asmuo(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getPavarde() {
        return pavarde;
    }

    @Override
    public String toString() {
        return "Asmuo [" +
            "vardas=" + vardas +
            ", pavardė=" + pavarde +
            ']';
    }
}
