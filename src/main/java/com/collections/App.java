package com.collections;

import com.collections.factories.CarFactory;
import com.collections.models.Car;

import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> randomCars = new CarFactory().createRandomCars(3);
        System.out.println(randomCars);

        Collections.sort(randomCars);
        System.out.println(randomCars);
    }
}
