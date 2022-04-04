package com.company.java1.paskaita15.parduotuvesexample;

import java.util.List;

public class Parduotuve {

    private List<PointOfSale> pointOfSales;

    public void collectMoney() {
        System.out.println("Laikas surinkti pinigus");
    }

    public void gautiKasosAparatuAtaskaitas() {
        for(PointOfSale pointOfSale: pointOfSales) {
            pointOfSale.gautiAtaskaita();
        }
    }
}
