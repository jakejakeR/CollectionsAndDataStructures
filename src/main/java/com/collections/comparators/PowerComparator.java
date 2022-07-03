package com.collections.comparators;

import com.collections.models.Car;

import java.util.Comparator;

public class PowerComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getEngine().getPower().compareTo(o2.getEngine().getPower());
    }
}
