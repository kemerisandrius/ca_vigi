package com.company.java1.paskaita14.gyvunaiinterface;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Reksas");
        Cat cat = new Cat("Murkis");

        List<Animal> animals = List.of(dog, cat);
        List<Named> namedAnimals = List.of(dog, cat);

        for (Animal animal : animals) {
            animal.say();
        }

        for (Named named: namedAnimals) {
            named.sayName();
        }
    }
}
