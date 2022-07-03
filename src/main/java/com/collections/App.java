package com.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        Set<String> setOfStrings = new HashSet<>();
        setOfStrings.add("Alicja");
        setOfStrings.add("Jakub");
        setOfStrings.add("Julia");
        setOfStrings.add("Aleksandra");
        setOfStrings.add("Marcin");
        setOfStrings.add("Bartosz");

        List<String> listOfSortedStrings = setOfStrings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listOfSortedStrings);

        List<String> sortedStringsByLength = setOfStrings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedStringsByLength);

    }
}
