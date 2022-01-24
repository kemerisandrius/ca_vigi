package com.company.paskaita8.compositionexample;

public class Main {
    public static void main(String[] args) {
        Daiktas daiktas = new Daiktas("telefonas", 1, 410);
        Asmuo andrius = new Asmuo("Andrius", "Kemeris", daiktas);
    }
}
