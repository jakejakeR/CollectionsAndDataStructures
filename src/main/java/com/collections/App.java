package com.collections;

import com.collections.factories.CarFactory;
import com.collections.models.Car;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.createRandomCar();
        Car car2 = carFactory.createRandomCar();
        Car car3 = carFactory.createRandomCar();

        Car[] cars = fillArray(car1, car2, car3);
        System.out.println(Arrays.asList(cars));
    }

    public static Car[] fillArray(Car... params) {
        Car[] cars = new Car[params.length];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = params[i];
        }

        return cars;
    }
}
