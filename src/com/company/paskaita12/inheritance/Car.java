package com.company.paskaita12.inheritance;

import java.util.Objects;

public class Car {

    private String color;
    private int doors;
    private double engineSize;

    public Car(String color, int doors, double engineSize) {
        this.color = color;
        this.doors = doors;
        this.engineSize = engineSize;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public double getEngineSize() {
        return engineSize;
    }

    @Override
    public String toString() {
        return "Car{" +
            "color='" + color + '\'' +
            ", doors=" + doors +
            ", engineSize=" + engineSize +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return doors == car.doors && Double.compare(car.engineSize, engineSize) == 0 && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, doors, engineSize);
    }

    @Override
    public Car clone() {
        return new Car(color, doors, engineSize);
    }

}
