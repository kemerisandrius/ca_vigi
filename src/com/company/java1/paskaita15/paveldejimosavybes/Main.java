package com.company.java1.paskaita15.paveldejimosavybes;

public class Main {

    public static void main(String[] args) {

        B objektas = new B();
        A kitasObjektas = new B();

        System.out.println(objektas.i);
        System.out.println(objektas.metodas());

        System.out.println("===========");

        System.out.println(kitasObjektas.i);
        System.out.println(kitasObjektas.metodas());

    }
}
