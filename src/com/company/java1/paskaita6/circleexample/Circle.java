package com.company.java1.paskaita6.circleexample;

public class Circle {
    private static final double PI = 3.14;

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculatePlot() {
        return PI * r * r;
    }

    public double getR() {
        return r;
    }
}
