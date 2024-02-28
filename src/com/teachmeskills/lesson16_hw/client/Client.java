package com.teachmeskills.lesson16_hw.client;

import com.teachmeskills.lesson16_hw.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is for describing the client
 */
public class Client {
    private String name;
    private int age;
    private String registrationDate;
    private List<Order> shoppingCart = new ArrayList<>();

    public Client(String name, int age, String registrationDate) {
        this.name = name;
        this.age = age;
        this.registrationDate = registrationDate;
    }

    public List<Order> getShoppingCart() {
        return shoppingCart;
    }

    public void addShoppingCartOrder (Order or) {
        getShoppingCart().add(or);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", registrationDate='" + registrationDate + '\'' +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
