package com.onlinestore.inventory.model;

public class Product {
    private String productId;
    private String name;
    private double price;

    public Product() {}

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter dan setter
}
