package com.teachmeskills.lesson16_hw.service;

import com.teachmeskills.lesson16_hw.client.Client;

import java.util.Iterator;
import java.util.Map;

/**
 * This class describes methods for displaying the key value from a hashmap
 */
public class Service {
    public static void serviceForEach1(Map<String, Client> map) {
        map.forEach((k, v) -> System.out.println("Key -> " + k + " Value " + v));
    }

    public static void serviceEntrySet(Map<String, Client> map) {
        for (Map.Entry<String, Client> cl : map.entrySet()) {
            System.out.println("Key " + cl.getKey() + " " + " Value " + cl.getValue());
        }
    }

    public static void serviceKeySet(Map<String, Client> map) {
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }
    }

    public static void serviceKeyValues(Map<String, Client> map) {
        for (Client cl : map.values()) {
            System.out.println("Values: " + cl);
        }
    }

    public static void serviceIterator(Map<String, Client> map){
        Iterator<Map.Entry<String, Client>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
