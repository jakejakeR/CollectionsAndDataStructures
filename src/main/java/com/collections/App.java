package com.collections;

import com.collections.factories.CarFactory;
import com.collections.models.Car;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.createRandomCar();
        Car car2 = carFactory.createRandomCar();
        Car car3 = carFactory.createRandomCar();

        List<Car> cars = fillArray(car1, car2, car3, car1);
        System.out.println(cars);
        System.out.println(cars.size());
    }

    public static List<Car> fillArray(Car... params) {
        List<Car> cars = new ArrayList<>();

        for (Car param : params) {
            cars.add(param);
        }
        return cars;
    }
}
