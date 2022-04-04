package com.company.java1.paskaita14.uzduotis1;

public class SeaVessel extends Vehicle {

    private int displacement;

    public SeaVessel(String name, int maxPassengers, double maxSpeed, int displacement) {
        super(name, maxPassengers, maxSpeed);
        this.displacement = displacement;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void launch() {
        System.out.println("Boom");
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
}
