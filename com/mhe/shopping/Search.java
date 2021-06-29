package com.mhe.shopping;

import java.util.ArrayList;

public class Search {
    public Product[] searchByName(String name) {
        ArrayList<Product> results = new ArrayList<Product>();
        for (int i = 0; i < Product.products.length; i++) {
            if (Product.products[i].name.matches(".*"+name+".*")) {
                results.add(Product.products[i]);
            }
        }
        
        return results.toArray(new Product[0]);
    }
    
    public Product[] searchByCategory(String categoryId) {
        ArrayList<Product> results = new ArrayList<Product>();
        for (int i = 0; i < Product.products.length; i++) {
            if (Product.products[i].category.id.equals(categoryId)) {
                results.add(Product.products[i]);
            }
        }
        
        return results.toArray(new Product[0]);
    }
    
    public Product[] searchByMarket(String marketId) {
        ArrayList<Product> results = new ArrayList<Product>();
        for (int i = 0; i < Product.products.length; i++) {
            if (Product.products[i].makert.id.equals(marketId)) {
                results.add(Product.products[i]);
            }
        }
        
        return results.toArray(new Product[0]);
    }
}