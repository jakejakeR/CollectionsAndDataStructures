package com.collections;

import com.collections.factories.CarFactory;
import com.collections.models.Car;

import java.util.*;

public class App {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car[] randomCars = carFactory.createRandomCars(10);

        Map<Integer, List<Car>> mapOfCars = generateCarMap(randomCars);
        System.out.println(mapOfCars);
        System.out.println(mapOfCars.keySet());
    }

    public static Map<Integer, List<Car>> generateCarMap(Car... cars) {
        Map<Integer, List<Car>> mapOfCars = new HashMap<>();
        for (Car car : cars) {
            mapOfCars.put(car.getEngine().getCapacity(), new ArrayList<>());
        }

        for (Car car : cars) {
            for (Integer key : mapOfCars.keySet()) {
                if(Objects.equals(car.getEngine().getCapacity(), key)) {
                    mapOfCars.get(key).add(car);
                }
            }
        }
        return mapOfCars;
    }
}
