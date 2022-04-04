package com.company.java1.paskaita12.gyvunai;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Erikas");
        Dog dog = new Dog("Reksas");
        Cat cat = new Cat("Murkis");
        Pincher pincher = new Pincher("Garbanius");

//        animal.say();
//        dog.say();
//        cat.say();
//        pincher.say();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(dog);
        animals.add(cat);
        animals.add(pincher);

        for (Animal a: animals) {
            System.out.println("-----");
            System.out.println(a.getClass().getSimpleName());

            if (a instanceof Dog) {
                ((Dog) a).bite();
            } else {
                a.say();
            }
        }
    }
}
