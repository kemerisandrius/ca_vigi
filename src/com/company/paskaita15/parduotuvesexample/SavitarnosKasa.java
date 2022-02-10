package com.company.paskaita15.parduotuvesexample;

import java.util.ArrayList;
import java.util.List;

public class SavitarnosKasa implements PointOfSale, MoneyCollector {

    public double cash;
    public List<String> items = new ArrayList<>();


    public void gautiAtaskaita() {
        System.out.println("Dienos ataskaita is savitarnos kasos");
    }

    @Override
    public void pranestiSandeliui() {
        System.out.println("Po atsiskaitymo sumazejo likuciu: " + items);
    }

    @Override
    public void atidarytiKasa() {
    }
}
