package com.company.advanced.stream;

public class Product {

    private int id;
    private String title;
    private ProductType type;
    private double price;

    public Product(int id, String title, ProductType type, double price) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
