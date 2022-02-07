package com.company.paskaita12.gyvunai;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Labas");
    }

    public String getName() {
        return name;
    }
}
