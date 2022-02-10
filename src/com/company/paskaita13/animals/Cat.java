package com.company.paskaita13.animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
