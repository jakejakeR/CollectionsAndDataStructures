package com.collections.factories;

import com.collections.models.Car;
import com.collections.models.Color;
import com.collections.models.Engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarFactory {

    private final Random random = new Random();
    private final List<String> names = new ArrayList<>(Arrays.asList("Audi", "Opel", "Mercedes", "Fiat", "Ford", "BMW"));

    public Car createRandomCar() {
        Car car = new Car();
        car.setName(generateName());
        car.setMaxSpeed(generateNumber(100, 250, 10));
        car.setEngine(generateEngine());
        car.setColor(generateColor());

        return car;
    }

    public Car[] createRandomCars(int amount) {
        Car[] cars = new Car[amount];
        for (int i = 0; i < amount; i++) {
            cars[i] = createRandomCar();
        }
        return cars;
    }

    public Car createCloneCar() {
        Car car = new Car();
        car.setName("clone");
        car.setMaxSpeed(100);
        car.setColor(Color.RED);
        car.setEngine(new Engine(100, 1000));

        return car;
    }

    private String generateName() {
        return names.get(random.nextInt(names.size()));
    }

    private Integer generateNumber(int min, int max, int step) {
        return random.ints(min/step, max/step)
                .findFirst()
                .getAsInt() * step;
    }

    private Engine generateEngine() {
        Engine engine = new Engine();
        engine.setPower(generateNumber(50, 200, 10));
        engine.setCapacity(generateNumber(1000, 5000, 1000));
        return engine;
    }

    private Color generateColor() {
        Integer index = generateNumber(0, Color.values().length, 1);
        return Color.values()[index];
    }
}
