package com.forest.lifeform.animal;

public class AnimalService {

    public static  String DEFAULT_RACOON_NAME = "Kroshka";
    public static String DEFAULT_RACOON_COLOR = "grey";
    public static char DEFAULT_RACOON_SEX = 'F';
    public static int DEFAULT_RACOON_AGE = 5;

    public Raccoon createRaccoon(){
        return createRaccoon(DEFAULT_RACOON_NAME, DEFAULT_RACOON_COLOR, DEFAULT_RACOON_SEX, DEFAULT_RACOON_AGE);
    }

    public Raccoon createRaccoon(String name, String color, char sex, int age) {
        return new Raccoon(name, color, sex, age);
    }
}
