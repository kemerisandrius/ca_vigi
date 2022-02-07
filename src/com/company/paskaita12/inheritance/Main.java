package com.company.paskaita12.inheritance;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Car red = new Car("Red", 5, 1.4);

        Car blue = new Car("Blue", 2, 4);
        Car blue2 = new Car("Blue", 2, 4);
        Car black = new Car("Black", 2, 4);
        List<Car> cars = List.of(blue, red, new Car("Yellow", 2, 6));

        //        System.out.println(red.equals(blue));
        //        System.out.println(blue.equals(blue2));
        //
        //        // true arba false Patirkinti ar egzistuoja sarase blue2 masina
        //
        //        System.out.println(cars.contains(blue2));
        System.out.println(cars);

        Set<Car> set = new HashSet<>();
        set.add(red);
        set.add(blue);
        set.add(blue2);

        Car newRedCar = red.clone();

        System.out.println(set);
    }


}
