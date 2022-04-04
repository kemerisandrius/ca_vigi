package com.company.advanced.generics;

import com.company.advanced.stream.Product;
import com.company.advanced.stream.ProductType;

public class Main {

    public static void main(String[] args) {
        Box<Product> box = new Box<>();
        Product bananas = new Product(1, "bananas", ProductType.TECH, 12.9);
        box.set(bananas);

        Pair<String, Product> stringProductPair = new Pair<>("pirmaPreke", bananas);

        System.out.println("Produkto kodas: " + stringProductPair.getLeft() + " produkto kaina: " + stringProductPair.getRight().getPrice());

        MyList<String> myAmazingList = new MyList<>();

        myAmazingList.add("Labas");
        myAmazingList.add("vakaras");
        myAmazingList.add("123123");

        System.out.println(myAmazingList.get(100).toUpperCase());

        System.out.println(myAmazingList);
    }
}
