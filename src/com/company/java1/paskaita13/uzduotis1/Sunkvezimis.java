package com.company.java1.paskaita13.uzduotis1;

import java.time.LocalDate;

public class Sunkvezimis extends TransportoPriemone {

    private double maksimalusKrovinioDydis;

    public Sunkvezimis(LocalDate registracijosData, String spalva, double maksimalusKrovinioDydis) {
        super(registracijosData, spalva);
        this.maksimalusKrovinioDydis = maksimalusKrovinioDydis;
    }

    @Override
    public void vaziuoti() {
        System.out.println("......wroom wroom.......");
    }

    public double getMaksimalusKrovinioDydis() {
        return maksimalusKrovinioDydis;
    }
}
