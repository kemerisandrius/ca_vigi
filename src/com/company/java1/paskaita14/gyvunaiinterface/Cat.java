package com.company.java1.paskaita14.gyvunaiinterface;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void say() {

    }

    @Override
    public void sayName() {

    }
}
