package com.company.java1.paskaita13.uzduotis1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Automobilis automobilis = new Automobilis(LocalDate.of(2022, 2, 2), "Juoda", 200);

        System.out.println(automobilis.getRegistracijosData());
    }

}
