package com.company.paskaita14.uzduotis1;

public class Vehicle {
    private String name;
    private int maxPassengers;
    private double maxSpeed;

    public Vehicle(String name, int maxPassengers, double maxSpeed) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
