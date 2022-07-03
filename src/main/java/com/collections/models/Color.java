package com.collections.models;

public enum Color {

    RED("red", 1),
    GREEN("green", 2),
    BLUE("blue", 3);

    private final int colorCode;
    private final String colorName;

    Color(String colorName, int colorCode) {
        this.colorName = colorName;
        this.colorCode = colorCode;
    }

    public String getColorName() {
        return colorName;
    }

    public int getColorCode() {
        return colorCode;
    }
}
