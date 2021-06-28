package com.mhe.shopping;


public class Payment {
    static String[] paymentMethods = {"mbok", "cash"};
    double totalPayed = 0;
    ShoppingCart cart;
    Payment(ShoppingCart theCart) {
        this.cart = theCart;
    }
    public void pay(double payment){
        totalPayed += payment;
        if (totalPayed == payment) {
            // done
        }
    }

    // public void cancle() {

    // }
    
}
