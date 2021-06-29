package com.mhe.shopping;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
     
    private Map<String, CartItem> items = new HashMap<String, CartItem>();
    private Coupon coupon;

    public void addToCart(Product product, int quantity) {
        CartItem itemExists = this.getItemInCart(product);
        if (itemExists != null)
            itemExists.quantity = quantity+itemExists.quantity;
        else
            itemExists = new CartItem(product, quantity);

        items.put(product.id, itemExists);
    }

    public void removeFromCart(Product product) {
        CartItem itemExists = this.getItemInCart(product);
        if (itemExists == null)
            return;
        else
            itemExists.quantity = itemExists.quantity-1;
        if (itemExists.quantity > 0)
            items.put(product.id, itemExists);
        else
            items.remove(product.id);
    }

    public double total() {
        double total = 0;

        CartItem[] items = this.getItems();
        for (int i=0;i<items.length;i++) {
            total = total+(items[i].product.price*items[i].quantity);
        }

        if (this.coupon != null) {
            total = (this.coupon.percent/100) * total;
        }

        return total;
    }
    
    public void applyCoupon(String code) {
        Coupon[] coupons = Coupon.coupons;
        for (int i=0;i<coupons.length;i++) {
            if (coupons[i].code == code) {
                this.coupon = coupons[i];
                break;
            }
        }
    }

    public CartItem[] getItems() {
        return this.items.values().toArray(new CartItem[0]);
    }

    public boolean isItemInCart(Product product) {
        return items.get(product.id) != null;
    }

    public CartItem getItemInCart(Product product) {
        return items.get(product.id);
    }
}

class Coupon {
    String code;
    int percent;

    Coupon(String c, int p) {
        this.code = c;
        this.percent = p;
    }

    static Coupon coupons[] = {
        new Coupon("FREEDISCOUNT", 20),
        new Coupon("COUPONME", 60),
    };
}

