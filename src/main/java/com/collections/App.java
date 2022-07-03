package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Map<Integer, Integer> integers = new HashMap<>();
        integers.put(1, 11);
        integers.put(2, 12);
        integers.put(3, 13);

        Set<Integer> keys = integers.keySet();
        Collection<Integer> values = integers.values();

        System.out.println(keys);
        System.out.println(values);

        Set<Map.Entry<Integer, Integer>> entries = integers.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}
