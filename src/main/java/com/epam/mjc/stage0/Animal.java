package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paws;
        String fur;
        if (numberOfPaws == 1) paws = "paw";
        else paws = "paws";
        if (hasFur == true) fur = "a";
        else fur = "no";
        String description = String.format("This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, paws, fur);
        return description;
    }
}
