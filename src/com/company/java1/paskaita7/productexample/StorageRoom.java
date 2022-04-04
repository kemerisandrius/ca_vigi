package com.company.java1.paskaita7.productexample;

public class StorageRoom {
    private Product[] products;

    public StorageRoom(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public Product findShampoo() {
        for (Product product: products) {
           if (product.getTitle().equals("Sampunas")) {
               return product;
           }
        }
        return null;
    }
}
