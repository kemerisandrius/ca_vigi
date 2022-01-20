package com.company.paskaita5;

public class Uzduotis4 {
    public static void main(String[] args) {
        Asmuo asmuo = new Asmuo("Petras", "Kurmelis", 32, "Kuktiškės");

        System.out.println(asmuo.getAsmensDuomenys());
        asmuo.svestiGimtadieni();
        System.out.println(asmuo.getAsmensDuomenys());
        asmuo.suskaiciuotiRaidesVarde(null);
    }
}
