package com.collections;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Integer> randomNumbers = generateTenRandomNumbers(10);
        System.out.println(randomNumbers);

        Map<Integer, List<Integer>> mapOfListsOfIntegers = generateMap(2, 5, 10);

        for (Integer randomNumber : randomNumbers) {
            for (Integer key : mapOfListsOfIntegers.keySet()) {
                if (randomNumber % key == 0) {
                    List<Integer> temporaryList = mapOfListsOfIntegers.get(key);
                    temporaryList.add(randomNumber);
                    mapOfListsOfIntegers.putIfAbsent(key, temporaryList);
                }
            }
        }

        System.out.println(mapOfListsOfIntegers);
    }

    public static List<Integer> generateTenRandomNumbers(int range) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < range; i++) {
            randomNumbers.add(random.nextInt(50) + 1);
        }
        return randomNumbers;
    }

    public static Map<Integer, List<Integer>> generateMap(Integer... keys) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (Integer key : keys) {
            map.put(key, new ArrayList<>());
        }
        return map;
    }
}
