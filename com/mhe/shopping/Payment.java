package com.mhe.shopping;


public class Payment {
    static String[] paymentMethods = {"mbok", "cash"};
    double totalPayed = 0;
    ShoppingCart cart;
    Payment(ShoppingCart theCart) {
        this.cart = theCart;
    }
    public boolean pay(double payment){
        totalPayed += payment;
        if (totalPayed == this.cart.total()) {
            return true;
        }

        return false;
    }

    // public void cancle() {

    // }
    
}
