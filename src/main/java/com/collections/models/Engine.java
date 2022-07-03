package com.collections.models;

import java.util.Objects;

public class Engine {

    private Integer power;
    private Integer capacity;

    public Engine() {
        power = 120;
        capacity = 2000;
    }

    public Engine(int power, int capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(power, engine.power) &&
                Objects.equals(capacity, engine.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, capacity);
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
