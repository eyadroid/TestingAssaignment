package com.mhe.shopping;

class Product {
    String id;
    String name;
    Category category;
    Market makert;
    double price;
    int stock;

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