package com.forest.lifeform.plant;

public class PlantService {

    private static int DEFAULT_PINE_AGE = 5;
    private static double DEFAULT_PINE_HEIGHT = 70;
    private static String DEFAULT_PINE_SPECIES = "Pine";
    private static int DEFAULT_HEATHER_AGE = 1;
    private static String DEFAULT_BUSH_SPECIES = "Heather";
    private static double DEFAULT_HEATHER_HEIGHT = 2;

    public Tree createPine() {
        return createPine(DEFAULT_PINE_AGE, DEFAULT_PINE_HEIGHT, DEFAULT_PINE_SPECIES);
    }

    public Tree createPine(int age, double height, String species){
        Tree tree = new Tree(age, height, species);
        return tree;
    }

    public Bush createHeather() {
        return createHeather(DEFAULT_HEATHER_AGE, DEFAULT_HEATHER_HEIGHT, DEFAULT_BUSH_SPECIES);
    }

    public Bush createHeather(int age, double height, String species) {
        Bush bush = new Bush(age, height, species);
        return bush;
    }

    public Flower createFlower(String color, int age, double height, String species ) {
        return new Flower(color, age, height, species);
    }
}
