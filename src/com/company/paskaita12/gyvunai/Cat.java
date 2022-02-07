package com.company.paskaita12.gyvunai;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
