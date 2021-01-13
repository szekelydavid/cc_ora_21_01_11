package com.company;

import java.util.*;
;

public class Main {
    static Main b1,b2;
    static Main l1,l2;
    static String[] birds = {"Sas","Fecske","Sirály","Ökörszem","Hárpia"};
    static String[] ladyBirds = {"Hétpettyes","Ötpettyes","Piros","Sárga","Szeplőtlen"};

    public static void main(String[] args) {
	// write your code here
        System.out.println("fsfsddf");

        List<Animals> animals = new ArrayList<Animals>();

        for (int i = 0; i < birds.length; i++) {
            animals.add(new Bird(birds[i], i%2==0));
        }
        for (int i = 0; i < ladyBirds.length; i++) {
            animals.add(new LadyBird(ladyBirds[i], i%2==1));
        }


/*
        Bird bird1 = new Bird("Jóska", false);
        Bird bird2 = new Bird("Jucika", true);
        LadyBird ladyBird1 = new LadyBird("Pötyin", true);
        LadyBird ladybird2 = new LadyBird("Putyin", false);
        bird1.fly();
        bird2.fly();
        ladyBird1.fly();
        ladybird2.fly();
*/

    }
    public void fly(){

    }
    public static void allFly(List<Animals> animals){
        System.out.println("* Flying time *");
        for(Animals animal: animals){
            ((Flying) animal).fly();
        }
    }

    public static void allFeed(List<Animals> animals){
        System.out.println("* Feeding time *");
        for(Animals animal: animals){
            ((Feeding) animal).feed();
        }
    }
}
