package com.mhe.shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {
    String id;
    ShoppingCart cart;
    Delivery deliveryMethod;
    String status;
    static Map<String, Order> orders = new HashMap<String, Order>();

    Order(String i, ShoppingCart c, Delivery d, String s) {
        this.id = i;
        this.cart = c;
        this.deliveryMethod = d;
        this.status = s;
    }
    static String placeOrder(ShoppingCart shoppingCart, Delivery deliveryMethod) {
        Order newOrder = new Order(
            orders.size()+"",
            shoppingCart,
            deliveryMethod,
            "WATING"
        );
        orders.put(
            newOrder.id,
            newOrder
        );

        return newOrder.id;
    }

    static void cancel(String orderId) {
        Order theOrder = orders.get(orderId);
        if (theOrder == null) return;

        theOrder.status = "CANCELED";

        orders.put(theOrder.id, theOrder);
    }

    static Order getOrder(String orderId) {
        return orders.get(orderId);
    }

}
