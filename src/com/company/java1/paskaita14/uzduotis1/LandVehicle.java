package com.company.java1.paskaita14.uzduotis1;

public class LandVehicle extends Vehicle {

    private int numWheels;

    public LandVehicle(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void drive() {
        System.out.println("Wroom");
    }
}
