package com.collections;

import com.collections.factories.CarFactory;
import com.collections.models.Car;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.createRandomCar();
        Car car2 = carFactory.createRandomCar();
        Car car3 = carFactory.createRandomCar();

        Map<String, Car> mapOfCars = generateCarMap(car1, car2, car3, car1);
        System.out.println(mapOfCars);
        System.out.println(mapOfCars.keySet());
    }

    public static Map<String, Car> generateCarMap(Car... cars) {
        Map<String, Car> mapOfCars = new HashMap<>();
        for (Car car : cars) {
            mapOfCars.put(car.getName(), car);
        }
        return mapOfCars;
    }
}
