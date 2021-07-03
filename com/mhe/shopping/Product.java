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

    public Product(String i, String n, Category c, Market m, double p, int s) {
        this.id = i;
        this.name = n;
        this.price = p;
        this.category = c;
        this.makert = m;
        this.stock = s;
    }

    public static Product[] products = {
        new Product(
            "1",
            "Iphone 6+",
            Category.categories[0],
            Market.markets[0],
            300,
            1
        ),
        new Product(
            "2",
            "Redmi Note 8",
            Category.categories[0],
            Market.markets[0],
            250,
            1
        ),

        new Product(
            "3",
            "Hp Omen",
            Category.categories[1],
            Market.markets[0],
            1000,
            1
        ),
        new Product(
            "4",
            "Lenovo ThinkPad",
            Category.categories[1],
            Market.markets[1],
            600,
            1
        ),
    };
}

class Category {
    String id;
    String name;
    public Category(String i, String n) {
        this.id = i;
        this.name = n;
    }

    public static Category[] categories = {
        new Category(
            "1",
            "Phones"
        ),
        new Category(
            "2",
            "Laptops"
        ),
    };
}

class Market {
    String id;
    String name;
    public Market(String i, String n) {
        this.id = i;
        this.name = n;
    }

    public static Market[] markets = {
        new Market(
            "1",
            "China Market"
        ),
        new Market(
            "2",
            "USA Market"
        ),
    };
}