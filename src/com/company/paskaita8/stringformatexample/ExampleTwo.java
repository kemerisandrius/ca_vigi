package com.company.paskaita8.stringformatexample;

public class ExampleTwo {
    public static void main(String[] args) {

        String columnName = "Vardas";
        String columnSurname = "Pavarde";
        String columnCity = "Miestas";

        String name = "Andrius";
        String surname = "Kemeris";
        String city = "Vilnius";

        String headerRow = String.format("|%10s|%10s|%10s|", columnName, columnSurname, columnCity);
        String firstRow = String.format("|%10s|%10s|%10s|", name, surname, city);

        System.out.println(headerRow);
        System.out.println(firstRow);

        System.out.println(String.format("%.4f", 12.54648494165));

        System.out.println("Orwell \"1984\"");
        System.out.println('\'');
    }
}
