package com.company.paskaita14.uzduotis1;

public class Hovercraft extends SeaVessel implements IsLandVehicle, IsSeaVessel {

    private int numWheels;

    public Hovercraft(String name, int maxPassengers, double maxSpeed, int displacement, int numWheels) {
        super(name, maxPassengers, maxSpeed, displacement);
        this.numWheels = numWheels;
    }

    public void enterLand() {
        System.out.println("Land entered");
    }

    public void enterSea() {
        System.out.println("Sea entered");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Wroom");
    }
}
