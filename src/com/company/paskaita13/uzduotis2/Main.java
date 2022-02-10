package com.company.paskaita13.uzduotis2;

public class Main {

    public static void main(String[] args) {
        Studentas studentas = new Studentas("Jonas", "Jonaitis");
        Destytojas destytojas = new Destytojas("Petras", "Petraitis");

        studentas.spausdinkInformacija();
        destytojas.spausdinkInformacija();
    }

}
