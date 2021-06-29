package com.mhe.shopping;

import java.util.HashMap;
import java.util.Map;

public class Order {
    String id;
    ShoppingCart cart;
    Delivery deliveryLocation;
    Payment payment;
    String status;
    static Map<String, Order> orders = new HashMap<String, Order>();

    Order(String i, ShoppingCart c, Delivery d, String s, Payment p) {
        this.id = i;
        this.cart = c;
        this.deliveryLocation = d;
        this.status = s;
        this.payment = p;
    }

    static String placeOrder(ShoppingCart shoppingCart, Delivery deliveryLocation, Payment payment) {
        if (payment.status != "COMPLETED") throw new Error("Payment Not Completed");
        Order newOrder = new Order(
            orders.size()+"",
            shoppingCart,
            deliveryLocation,
            "WATING",
            payment
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

    static void changeDeliveryLocation(String orderId, Delivery newLocation) {
        Order theOrder = orders.get(orderId);
        if (theOrder == null) return;

        theOrder.deliveryLocation = newLocation;

        orders.put(theOrder.id, theOrder);
    }

    static Order getOrder(String orderId) {
        return orders.get(orderId);
    }

}
