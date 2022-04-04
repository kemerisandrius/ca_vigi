package com.company.java1.paskaita13.uzduotis1;

import java.time.LocalDate;

public class Automobilis extends TransportoPriemone {

    private int bagazinesTalpa;

    public Automobilis(LocalDate registracijosData, String spalva, int bagazinesTalpa) {
        super(registracijosData, spalva);
        this.bagazinesTalpa = bagazinesTalpa;
    }

    @Override
    public void vaziuoti() {
        System.out.println("Wroom wroom");
    }

    public int getBagazinesTalpa() {
        return bagazinesTalpa;
    }
}
