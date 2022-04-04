package com.company.java1.paskaita15.parduotuvesexample;

import java.util.ArrayList;
import java.util.List;

public class KasosAparatas implements PointOfSale, MoneyCollector {

    public double cash;

    public List<String> items = new ArrayList<>();

    public double countPrice() {
        double suma = 0;
        for (String item : items) {
            suma += Integer.parseInt(item);
        }
        return suma;
    }

    public void gautiAtaskaita() {
        System.out.println("Dienos ataskaita is kasos aparato");
    }

    @Override
    public void pranestiSandeliui() {
        System.out.println("buvo nupirkta: " + items);
    }

    public double getCash() {
        return cash;
    }

    @Override
    public void atidarytiKasa() {

    }
}
