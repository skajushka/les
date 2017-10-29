package com.les.lifeform.plant;

public class Daisy extends FlowerImpl implements Flower {

    private static String SPECIES = "Bellis perennis";

    public Daisy(String color, int age, double height) {
        super(color, age, height, SPECIES);
    }
}
