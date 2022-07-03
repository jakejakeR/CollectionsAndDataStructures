package com.collections;

import com.collections.factories.CarFactory;
import com.collections.models.Car;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<Car> randomCars = carFactory.createRandomCars(5);

        randomCars.forEach(System.out::println);
        System.out.println("===========");

        Comparator<Car> compareDescendingCapacity = (car1, car2) -> car2.getEngine().getCapacity() - car1.getEngine().getCapacity();
        Comparator<Car> comparePower = Comparator.comparingInt(car -> car.getEngine().getPower());
        Comparator<Car> compareColor = Comparator.comparingInt(car -> car.getColor().ordinal());

        List<Car> sortByCapacityDescending = sortCars(randomCars, compareDescendingCapacity);
        sortByCapacityDescending.forEach(System.out::println);
        System.out.println("===========");

        List<Car> sortByPower= sortCars(randomCars, comparePower);
        sortByPower.forEach(System.out::println);
        System.out.println("===========");

        List<Car> sortByColor = sortCars(randomCars, compareColor);
        sortByColor.forEach(System.out::println);
    }

    public static List<Car> sortCars(List<Car> cars, Comparator<Car> comparator) {
        Collections.sort(cars, comparator);
        List<Car> carList = cars;
        return carList;
    }
}

