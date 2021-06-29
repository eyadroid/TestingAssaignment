package com.mhe.shopping;

public class Product {
    String id;
    String name;
    Category category;
    Market makert;
    double price;
    int stock;

    public Product(String i, String n, double p, int s) {
        this.id = i;
        this.name = n;
        this.price = p;
        this.stock = s;
    }

    static Product[] products = {};
}

class Category {
    String id;
    String name;
}

class Market {
    String id;
    String name;
}