package com.collections;

import com.collections.factories.CarFactory;
import com.collections.models.Car;

import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> randomCars = new CarFactory().createRandomCars(3);
        randomCars.forEach(System.out::println);
        System.out.println("===========");

        randomCars.sort(Comparator.comparing(car -> car.getEngine().getCapacity()));
        randomCars.forEach(System.out::println);
    }
}

