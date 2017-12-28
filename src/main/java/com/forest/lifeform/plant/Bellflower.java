package com.forest.lifeform.plant;

public class Bellflower extends FlowerImpl implements Flower {

    private static String SPECIES = "Campanula persicifolia";

    public Bellflower(String color, int age, double height) {
        super(color, age, height, SPECIES);
    }
}
