package com.company.paskaita15.uzduotis1;

import java.util.Random;

public abstract class Skaicius {

    private int[] masyvas = new int[20];
    protected Random random = new Random();

    public abstract int generuokSkaiciu();

    public int suma() {
        int suma = 0;
        for (int el : masyvas) {
            suma += el;
        }

        return suma;
    }

    public void generuokMasyva() {
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = generuokSkaiciu();
        }
    }

    public int[] getMasyvas() {
        return masyvas;
    }
}
