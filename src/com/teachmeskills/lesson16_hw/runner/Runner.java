package com.teachmeskills.lesson16_hw.runner;


import com.teachmeskills.lesson16_hw.fabric.fabricClient.FabricClient;
import com.teachmeskills.lesson16_hw.fabric.fabricOrder.FabricOrder;
import com.teachmeskills.lesson16_hw.service.Service;
import com.teachmeskills.lesson16_hw.service.Shop;

public class Runner {
    public static void main(String[] args) {

        Service.serviceForEach1(Shop.buyProduct(FabricClient.createClient(), FabricOrder.getOrder()));
        System.out.println("___________________");
        Service.serviceEntrySet(Shop.buyProduct(FabricClient.createClient(), FabricOrder.getOrder()));
        System.out.println("___________________");
        Service.serviceKeyValues(Shop.buyProduct(FabricClient.createClient(), FabricOrder.getOrder()));
        System.out.println("___________________");
        Service.serviceKeySet(Shop.buyProduct(FabricClient.createClient(), FabricOrder.getOrder()));
        System.out.println("___________________");
        Service.serviceIterator(Shop.buyProduct(FabricClient.createClient(), FabricOrder.getOrder()));

    }
}
