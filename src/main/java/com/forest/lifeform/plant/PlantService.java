package com.forest.lifeform.plant;

import com.forest.lifeform.Species;

public class PlantService {

    private static int DEFAULT_PINE_AGE = 5;
    private static double DEFAULT_PINE_HEIGHT = 70;
    private static Species DEFAULT_PINE_SPECIES = Species.PINE;
    private static int DEFAULT_HEATHER_AGE = 1;
    private static Species DEFAULT_BUSH_SPECIES = Species.HEATHER;
    private static double DEFAULT_HEATHER_HEIGHT = 2;

    public Tree createPine() {
        return createPine(DEFAULT_PINE_AGE, DEFAULT_PINE_HEIGHT, DEFAULT_PINE_SPECIES);
    }

    public Tree createPine(int age, double height, Species species){
        Tree tree = new Tree(age, height, species);
        return tree;
    }

    public Bush createHeather() {
        return createHeather(DEFAULT_HEATHER_AGE, DEFAULT_HEATHER_HEIGHT, DEFAULT_BUSH_SPECIES);
    }

    public Bush createHeather(int age, double height, Species species) {
        Bush bush = new Bush(age, height, species);
        return bush;
    }

    public Flower createFlower(String color, int age, double height, Species species ) {
        return new Flower(color, age, height, species);
    }
}
