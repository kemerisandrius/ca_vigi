package com.company.paskaita15.uzduotis1;

public class NeigiamasSkaicius extends Skaicius {

    @Override
    public int generuokSkaiciu() {
        return random.nextInt(500) * -1;
    }
}
