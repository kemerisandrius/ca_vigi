package com.company.java1.paskaita15.uzduotis1;

public class NelyginisSkaicius extends Skaicius {

    @Override
    public int generuokSkaiciu() {
        int randomNumber = random.nextInt(500);
        if (randomNumber % 2 == 0) {
            return randomNumber + 1;
        } else {
            return randomNumber;
        }
    }
}
