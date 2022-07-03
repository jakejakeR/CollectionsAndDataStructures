package com.collections;

import com.collections.factories.CarFactory;
import com.collections.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(Arrays.asList(new CarFactory().createRandomCars(10)));
        Iterator<Car> carIterator = cars.iterator();
        System.out.println("Initial size of list: " + cars.size());

        while (carIterator.hasNext()) {
            Car nextCar = carIterator.next();
            System.out.println(nextCar);
            if(!carIterator.hasNext()) {
                carIterator.remove();
            }
        }

        System.out.println("Size of list after removing last: " + cars.size());
    }
}
