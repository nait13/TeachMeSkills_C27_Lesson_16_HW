package com.teachmeskills.lesson16_hw.fabric.fabricClient;

import com.teachmeskills.lesson16_hw.client.Client;

/**
 * The class creates an array of clients
 */
public class FabricClient {
    public static Client[] createClient() {
        Client cl1 = new Client("Alex", 22, "12.02.1992");
        Client cl2 = new Client("Masha", 24, "12.02.2000");
        Client cl3 = new Client("Pasha", 28, "12.02.1996");

        Client[] arr = {cl1, cl2, cl3};

        return arr;

    }
}
