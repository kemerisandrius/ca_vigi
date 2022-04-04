package com.company.java1.paskaita8.compositionexample;

import java.time.LocalDate;

public class Asmuo {
    private String vardas;
    private String pavarde;
    private Daiktas daiktas;
    private LocalDate gimimoDiena;

    public Asmuo(String vardas, String pavarde, Daiktas daiktas, LocalDate gimimoDiena) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.daiktas = daiktas;
        this.gimimoDiena = gimimoDiena;
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
