package com.company.java1.paskaita12.gyvunai;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }

    public void bite() {
        System.out.println("Auch");
    }
}
