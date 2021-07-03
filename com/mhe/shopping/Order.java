package com.mhe.shopping;

import java.util.HashMap;
import java.util.Map;

public class Order {
    public String id;
    public ShoppingCart cart;
    public Delivery deliveryLocation;
    public Payment payment;
    public String status;
    static Map<String, Order> orders = new HashMap<String, Order>();

    public Order(String i, ShoppingCart c, Delivery d, String s, Payment p) {
        this.id = i;
        this.cart = c;
        this.deliveryLocation = d;
        this.status = s;
        this.payment = p;
    }

    public static String placeOrder(ShoppingCart shoppingCart, Delivery deliveryLocation, Payment payment) {
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

    public static void cancel(String orderId) {
        Order theOrder = orders.get(orderId);
        if (theOrder == null) return;

        theOrder.status = "CANCELED";

        orders.put(theOrder.id, theOrder);
    }

    public static void changeDeliveryLocation(String orderId, Delivery newLocation) {
        Order theOrder = orders.get(orderId);
        if (theOrder == null) return;

        theOrder.deliveryLocation = newLocation;

        orders.put(theOrder.id, theOrder);
    }

    public static Order getOrder(String orderId) {
        return orders.get(orderId);
    }

}
