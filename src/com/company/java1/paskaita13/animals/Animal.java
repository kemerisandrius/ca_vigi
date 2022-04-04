package com.company.java1.paskaita13.animals;

public abstract class Animal {
    private String name;

    public abstract void say();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
