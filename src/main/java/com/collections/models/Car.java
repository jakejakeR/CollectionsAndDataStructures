package com.collections.models;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private String name;
    private int maxSpeed;
    private Engine engine;
    private Color color;

    public Car() {
        maxSpeed = 160;
        name = "default name";
        engine = new Engine();
    }

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engine = new Engine();
    }

    public Car(String name, int maxSpeed, Engine engine) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.maxSpeed, car.getMaxSpeed());
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engine=" + engine +
                ", color=" + color +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                Objects.equals(name, car.name) &&
                Objects.equals(engine, car.engine) &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSpeed, engine, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
