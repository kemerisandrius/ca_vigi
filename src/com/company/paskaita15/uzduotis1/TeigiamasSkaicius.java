package com.company.paskaita15.uzduotis1;

public class TeigiamasSkaicius extends Skaicius {

    @Override
    public int generuokSkaiciu() {
        return random.nextInt(500);
    }
}
