package com.company.advanced.stream;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Toilet paper x8", ProductType.HYGIENE, 3.42);
        Product product1 = new Product(2, "Banana 1kg", ProductType.FOOD, 1.69);
        Product product2 = new Product(3, "Led bulb", ProductType.HOUSEHOLD, 3.59);
        Product product3 = new Product(4, "Electric Kettle", ProductType.TECH, 39);
        Product product4 = new Product(5, "Almond 1kg", ProductType.FOOD, 9.99);
        Product product5 = new Product(6, "Fairy", ProductType.HOUSEHOLD, 7.99);
        Product product6 = new Product(7, "Toothpaste", ProductType.HYGIENE, 4.99);
        Product product7 = new Product(8, "Toaster", ProductType.TECH, 19.99);

        List<Product> products = List.of(product, product1, product2, product3, product4, product5, product6, product7);

        //Suskaiciuoti visu maisto produktu suma
        double suma = products.stream()
            .filter(p -> p.getType() == ProductType.FOOD)
            .map(Product::getPrice)
            .mapToDouble(Double::doubleValue)
            .sum();

        //Gauti nauja lista tik su higienos produktais
        List<Product> hygieneProducts = products.stream()
            .filter(p -> p.getType() == ProductType.HYGIENE)
            .toList();

        //Gauti produktus, kuriu kaina didesne nei 5 eurai
        List<Product> productsAbove5Eur = products.stream()
            .filter(p -> p.getPrice() > 5)
            .toList();

        //Suskaičiuoti kiek produktų turi pavadinimą Electric Kettle
        long count = products.stream()
            .filter(p -> p.getTitle().equals("Electric Kettle"))
            .count();

        //Surasti prekę su didžiausia kaina
        double maxPrice = products.stream()
            .map(Product::getPrice)
            .mapToDouble(Double::doubleValue)
            .max()
            .getAsDouble();

        System.out.println(suma);
    }

}
