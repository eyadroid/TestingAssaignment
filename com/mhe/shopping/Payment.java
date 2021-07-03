package com.mhe.shopping;

public class Payment {
    double totalPayed = 0;
    ShoppingCart cart;
    PaymentMethod paymentMethod;
    public String status;
    public Payment(ShoppingCart theCart, PaymentMethod pm) {
        this.cart = theCart;
        this.paymentMethod = pm;
        this.status = "PENDING";
    }
    public Payment(ShoppingCart theCart, PaymentMethod pm, String s) {
        this.cart = theCart;
        this.paymentMethod = pm;
        this.status = s;
    }
    public boolean pay(double payment){
        totalPayed += payment;
        if (totalPayed == this.cart.total() + (this.paymentMethod == PaymentMethod.cash ? 10 : 0)) {
            this.status = "COMPLETED";
            return true;
        }

        return false;
    }

    public void cancle() {
        this.status = "CANCELED";
    }
    
}
