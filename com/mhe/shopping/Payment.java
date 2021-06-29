package com.mhe.shopping;

public class Payment {
    double totalPayed = 0;
    ShoppingCart cart;
    PaymentMethod paymentMethod;
    String status;
    Payment(ShoppingCart theCart, PaymentMethod pm) {
        this.cart = theCart;
        this.paymentMethod = pm;
        this.status = "PENDING";
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
