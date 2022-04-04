package com.company.java1.paskaita7.productexample;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Sampunas", "Kvepia", 12);
        Product product2 = new Product("Kremas", "Kvepia", 5);
        Product product3 = new Product("Desra", "Kvepia", 8);

        Product[] products = new Product[3];
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;

        StorageRoom storageRoom = new StorageRoom(products);

        Product shampoo = storageRoom.findShampoo();
        System.out.println(shampoo.getPrice());
    }
}
