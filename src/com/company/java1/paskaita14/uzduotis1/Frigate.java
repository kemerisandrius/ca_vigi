package com.company.java1.paskaita14.uzduotis1;

public class Frigate extends SeaVessel implements IsSeaVessel {

    public Frigate(String name, int maxPassengers, double maxSpeed, int displacement) {
        super(name, maxPassengers, maxSpeed, displacement);
    }

    public void fireGun() {
        System.out.println("Kaboom");
    }
}
