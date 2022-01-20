package com.company.paskaita5;

// DRY - Do not repeat yourself
// Scope - kodo dalis nuo vieno "{" iki kito "}"
public class Product {
    private static final String SHOP_NAME = "Parduotuve X";

    private String title;
    private String description;
    private double price;

    private Product(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Product(String title, String description, double price) {
        this(title, description);
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
