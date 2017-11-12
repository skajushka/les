package com.forest.lifeform.plant;

public class PlantService {

    private static int DEFAULT_PINE_AGE = 5;
    private static double DEFAULT_PINE_HEIGHT = 70;
    private static int DEFAULT_HEATHER_AGE = 1;
    private static double DEFAULT_HEATHER_HEIGHT = 2;

    public Pine createPine() {
        return createPine(DEFAULT_PINE_AGE, DEFAULT_PINE_HEIGHT);
    }

    public Pine createPine(int age, double height){
        Pine pine = new Pine(age, height);
        return pine;
    }

    public Heather createHeather() {
        return createHeather(DEFAULT_HEATHER_AGE, DEFAULT_HEATHER_HEIGHT);
    }

    public Heather createHeather(int age, double height) {
        Heather heather = new Heather(age, height);
        return heather;
    }

}
