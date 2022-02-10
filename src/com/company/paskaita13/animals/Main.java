package com.company.paskaita13.animals;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Murkis");
        Animal dog = new Dog("Reksas");

        List<Animal> animals = List.of(cat, dog);

        for (Animal animal: animals) {
            animal.say();
            System.out.println(animal.getName());
        }
    }

}
