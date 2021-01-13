package com.company;

public class Bird extends Animals implements Flying {
    String name;
    boolean isFemale;


    public Bird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }
    @Override
    public void fly() {
        System.out.println("Buzz, Buzz!");
    }
    @Override
    public void feed() {
        System.out.println("What a wonderful worm");
    }

}
