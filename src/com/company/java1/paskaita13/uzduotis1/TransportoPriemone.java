package com.company.java1.paskaita13.uzduotis1;

import java.time.LocalDate;

public abstract class TransportoPriemone {

    private LocalDate registracijosData;
    private String spalva;

    public abstract void vaziuoti();

    public TransportoPriemone(LocalDate registracijosData, String spalva) {
        this.registracijosData = registracijosData;
        this.spalva = spalva;
    }

    public LocalDate getRegistracijosData() {
        return registracijosData;
    }

    public String getSpalva() {
        return spalva;
    }
}
