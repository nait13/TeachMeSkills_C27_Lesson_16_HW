package com.teachmeskills.lesson16_hw.order;

/**
 * Class for order description
 */
public class Order {
    private double price;
    private String description;

    public Order(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
