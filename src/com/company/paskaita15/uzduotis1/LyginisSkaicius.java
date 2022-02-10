package com.company.paskaita15.uzduotis1;

public class LyginisSkaicius extends Skaicius {

    @Override
    public int generuokSkaiciu() {
        return random.nextInt(250) * 2;
    }
}
