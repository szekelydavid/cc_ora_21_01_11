package com.company;

public class LadyBird extends Animals implements Flying,Feeding {
    String name;
    boolean isFemale;

    public LadyBird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override
    public void fly() {
        System.out.println("Chips, Chips!");
    }

    @Override
    public void feed() {
        System.out.println("I love aphid");
    }
}
