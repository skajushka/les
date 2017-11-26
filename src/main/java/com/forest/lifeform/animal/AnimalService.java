package com.forest.lifeform.animal;

public class AnimalService {

    public static  String DEFAULT_RACOON_NAME = "Kroshka";
    public static String DEFAULT_RACOON_COLOR = "grey";
    public static Sex DEFAULT_RACOON_SEX = Sex.FEMALE;
    public static int DEFAULT_RACOON_AGE = 5;
    public static  String DEFAULT_CAT_NAME = "Pipka";
    public static String DEFAULT_CAT_COLOR = "tricolor";
    public static Sex DEFAULT_CAT_SEX = Sex.FEMALE;
    public static int DEFAULT_CAT_AGE = 3;
    public static  String DEFAULT_DOG_NAME = "Charka";
    public static String DEFAULT_DOG_COLOR = "black";
    public static Sex DEFAULT_DOG_SEX = Sex.MALE;
    public static int DEFAULT_DOG_AGE = 5;

    public Raccoon createRaccoon(){
        return createRaccoon(DEFAULT_RACOON_NAME, DEFAULT_RACOON_COLOR, DEFAULT_RACOON_SEX, DEFAULT_RACOON_AGE);
    }

    public Raccoon createRaccoon(String name, String color, Sex sex, int age) {
        return new Raccoon(name, color, sex, age);
    }

    public DomesticCat createDomesticCat() {
        return createDomesticCat(DEFAULT_CAT_NAME, DEFAULT_CAT_COLOR, DEFAULT_CAT_SEX, DEFAULT_CAT_AGE);
    }

    public DomesticCat createDomesticCat(String name, String color, Sex sex, int age) {
        return new DomesticCat(name, color, sex, age);
    }

    public ZwergSchnautzer createZwergSchnautzer() {
        return createZwergSchnautzer(DEFAULT_DOG_NAME, DEFAULT_DOG_COLOR, DEFAULT_DOG_SEX, DEFAULT_DOG_AGE);
    }

    public ZwergSchnautzer createZwergSchnautzer(String name, String color, Sex sex, int age) {
        return new ZwergSchnautzer(name, color, sex, age);
    }
}
