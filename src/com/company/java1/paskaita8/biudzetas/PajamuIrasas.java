package com.company.java1.paskaita8.biudzetas;

import java.time.LocalDate;

public class PajamuIrasas {
    private double suma;
    private LocalDate data;
    private String kategorija;
    private boolean arIBanka;
    private String papildomaInformacija;

    public PajamuIrasas(double suma, LocalDate data, String kategorija, boolean arIBanka, String papildomaInformacija) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.arIBanka = arIBanka;
        this.papildomaInformacija = papildomaInformacija;
    }

    public double getSuma() {
        return suma;
    }

    public LocalDate getData() {
        return data;
    }

    public String getKategorija() {
        return kategorija;
    }

    public boolean isArIBanka() {
        return arIBanka;
    }

    public String getPapildomaInformacija() {
        return papildomaInformacija;
    }
}
