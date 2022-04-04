package com.company.java1.paskaita8.biudzetas;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        PajamuIrasas pajamuIrasas = new PajamuIrasas(100, LocalDate.now(), "Atlygis", true, "");

        PajamuIrasas[] pajamuIrasai = { pajamuIrasas };

        Biuzdetas biuzdetas = new Biuzdetas(pajamuIrasai);

        System.out.println(biuzdetas.getPajamos()[0].getKategorija());
    }
}
