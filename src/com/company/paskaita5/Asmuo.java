package com.company.paskaita5;

public class Asmuo {
    private String vardas;
    private String pavarde;
    private int amzius;
    private String adresas;

    public Asmuo(String vardas, String pavarde, int amzius, String adresas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.adresas = adresas;
    }

    public String getAsmensDuomenys() {
        return vardas + " " + pavarde + " amzius: " + amzius;
    }

    public int suskaiciuotiRaidesVarde(String vardas) {
        return vardas.length();
    }

    public void svestiGimtadieni() {
        padidintiAmziu();
    }

    private void padidintiAmziu() {
        amzius++;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }
}
