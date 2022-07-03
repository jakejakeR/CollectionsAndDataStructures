package com.collections;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Integer[] numbers = fillArray(1, 2, 3, 4, 5);
        System.out.println(Arrays.asList(numbers));
    }

    public static Integer[] fillArray(Integer... params) {
        Integer[] numbers = new Integer[params.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = params[i] * 2;
        }

        return numbers;
    }
}
