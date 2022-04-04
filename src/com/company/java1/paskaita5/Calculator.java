package com.company.java1.paskaita5;

// Imanoma sukurti klase, kurios neimanoma inicializuoti (pvz.: new Calculator()) sukuriant private tuscia constructoriu
public class Calculator {

    private Calculator() {}

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }
}
