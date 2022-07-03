package com.collections;

import java.util.HashSet;
import java.util.Set;

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
        setOfStrings.add("Bartosz");

        System.out.println(setOfStrings.size());

    }
}
