package com.company.java1.paskaita8.compositionexample;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Daiktas daiktas = new Daiktas("telefonas", 1, 410);
        Asmuo andrius = new Asmuo("Andrius", "Kemeris", daiktas, LocalDate.now());
    }
}
