package com.teachmeskills.lesson16_hw.service;

import com.teachmeskills.lesson16_hw.client.Client;
import com.teachmeskills.lesson16_hw.consts.PassportID;
import com.teachmeskills.lesson16_hw.order.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * In this class, orders are added to clients
 */
public class Shop {
    public static Map<String, Client> buyProduct(Client[] arrCl, Order[] arrOr) {
        arrCl[0].addShoppingCartOrder(arrOr[0]);
        arrCl[0].addShoppingCartOrder(arrOr[1]);

        arrCl[1].addShoppingCartOrder(arrOr[2]);
        arrCl[1].addShoppingCartOrder(arrOr[3]);

        arrCl[2].addShoppingCartOrder(arrOr[1]);
        arrCl[2].addShoppingCartOrder(arrOr[3]);

        Map<String, Client> clientMap = new HashMap<>();
        clientMap.put(PassportID.PASSPORT_ID_CLIENT1, arrCl[0]);
        clientMap.put(PassportID.PASSPORT_ID_CLIENT2, arrCl[1]);
        clientMap.put(PassportID.PASSPORT_ID_CLIENT3, arrCl[2]);

        return clientMap;
    }
}
