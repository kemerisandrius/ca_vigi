package com.company.java1.paskaita14.gyvunaiinterface;

public class Dog implements Animal, Named {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }

    public String getName() {
        return name;
    }

    @Override
    public void sayName() {
        System.out.println(name);
    }
}
