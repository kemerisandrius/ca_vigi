package com.company.paskaita6.productexample;

public class Product {
    private String title;
    private String description;
    private double price;

    public Product(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public static Product createDefaultProduct() {
        return new Product("Skarelė", "placeholder_description", 0);
    }
}
