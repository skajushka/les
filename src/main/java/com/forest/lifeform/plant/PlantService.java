package com.forest.lifeform.plant;

public class PlantService {

    private static int DEFAULT_PINE_AGE = 5;
    private static double DEFAULT_PINE_HEIGHT = 70;
    private static int DEFAULT_HEATHER_AGE = 1;
    private static double DEFAULT_HEATHER_HEIGHT = 2;
    private static int DEFAULT_DAISY_AGE = 1;
    private static double DEFAULT_DAISY_HEIGHT = 10;
    private static String DEFAULT_DAISY_COLOR = "white";
    private static String DEFAULT_BELLFLOWER_COLOR = "blue";
    private static int DEFAULT_BELLFLOWER_AGE = 1;
    private static double DEFAULT_BELLFLOWER_HEIGHT = 10;

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

    public Daisy createDaisy() {
        return createDaisy(DEFAULT_DAISY_COLOR, DEFAULT_DAISY_AGE, DEFAULT_DAISY_HEIGHT);
    }

    public Daisy createDaisy(String color, int age, double height) {
        Daisy daisy = new Daisy(color, age, height);
        return daisy;
    }

    public Bellflower createBellflower() {
        return createBellflower(DEFAULT_BELLFLOWER_COLOR, DEFAULT_BELLFLOWER_AGE, DEFAULT_BELLFLOWER_HEIGHT);
    }

    public Bellflower createBellflower(String color, int age, double height) {
        Bellflower bellflower = new Bellflower(color, age, height);
        return bellflower;
    }
}
