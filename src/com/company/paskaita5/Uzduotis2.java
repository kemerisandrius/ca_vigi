package com.company.paskaita5;

public class Uzduotis2 {
    public static void main(String[] args) {
        spausdink("Andrius", "Kemeris", "Rust", 52);
        spausdink("Andrius", "Kemeris", "Rust");
    }

    // --------------- spausdinimas ---------------
    public static void spausdink(String vardas, String pavarde, String kalba, int savaiciuSkaicius) {
        System.out.println("Aš, " + vardas + " " + pavarde + ", tikrai išmoksiu programuoti " + kalba +" kalba per " + savaiciuSkaicius+ " savaites");
    }

    public static void spausdink(String vardas, String pavarde, String kalba) {
        System.out.println("Aš, " + vardas + " " + pavarde + ", tikrai išmoksiu programuoti " + kalba +" kalba.");
    }

    // --------------- end spausdinimas ---------------

}
