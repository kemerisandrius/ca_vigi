package com.company.java1.paskaita14.uzduotis1;

public class Jeep extends LandVehicle implements IsLandVehicle {

    public Jeep(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed, numWheels);
    }

    public void soundHorn() {
        System.out.println("Pyp");
    }
}
