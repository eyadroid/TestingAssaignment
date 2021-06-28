package com.mhe.shopping;

class ShoppingCart {
     
    CartItem items[] = {};
    Coupon coupon;

    public void addToCart(Product product, int quantity) {


    }

    public void removeFromCart(Product product) {

    }

    public double total() {
        return 0.0;
    }
    
    public void applyCoupon(String code) {

    }

    public boolean itemInCart(Product product) {

        return false;
    }
}
class CartItem {
    String id;
    Product product;
    int quantity;
}

class Coupon {
    String code;
    int percent;

    static Coupon coupons[] = {};
}

