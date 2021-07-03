package com.mhe.shopping;

public class CartItem {
    Product product;
    int quantity;

    public CartItem(Product p, int q) {
        this.product = p;
        this.quantity = q;
    }
}
