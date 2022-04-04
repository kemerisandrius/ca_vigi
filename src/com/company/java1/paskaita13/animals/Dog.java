package com.company.java1.paskaita13.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }
}
