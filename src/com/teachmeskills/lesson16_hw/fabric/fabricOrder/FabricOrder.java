package com.teachmeskills.lesson16_hw.fabric.fabricOrder;

import com.teachmeskills.lesson16_hw.order.Order;

/**
 * The class creates an array of order
 */
public class FabricOrder {
    public static Order[] getOrder() {
        Order or1 = new Order(4.25, "Apple");
        Order or2 = new Order(1.25, "Potato");
        Order or3 = new Order(3.20, "Beer");
        Order or4 = new Order(5.10, "Meet");

        Order[] arr = {or1, or2, or3, or4};

        return arr;
    }
}
