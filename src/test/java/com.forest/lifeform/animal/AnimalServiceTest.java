package com.forest.lifeform.animal;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalServiceTest {

    private static String DEFAULT_RACCOON_NAME = "Kroshka";
    private static String DEFAULT_RACCOON_COLOR = "grey";
    private static char DEFAULT_RACCOON_SEX = 'F';
    private static int DEFAULT_RACCOON_AGE = 5;
    private static String RACCOON_NAME = "Kacechka";
    private static String RACCOON_COLOR = "red";
    private static char RACCOON_SEX = 'F';
    private static int RACCOON_AGE = 32;

    private static String DEFAULT_CAT_NAME = "Pipka";
    private static String DEFAULT_CAT_COLOR = "tricolor";
    private static char DEFAULT_CAT_SEX = 'F';
    private static int DEFAULT_CAT_AGE = 3;
    private static String CAT_NAME = "Pushynka";
    private static String CAT_COLOR = "grey";
    private static char CAT_SEX = 'F';
    private static int CAT_AGE = 10;

    private static String DEFAULT_DOG_NAME = "Charka";
    private static String DEFAULT_DOG_COLOR = "black";
    private static char DEFAULT_DOG_SEX = 'M';
    private static int DEFAULT_DOG_AGE = 5;
    private static String DOG_NAME = "Barabaka";
    private static String DOG_COLOR = "white";
    private static char DOG_SEX = 'M';
    private static int DOG_AGE = 7;

    private AnimalService animalService;

    @Before
    public void setUp() {
        this.animalService = new AnimalService();
    }

    @Test
    public void createRaccoon() {
        Raccoon raccoon = animalService.createRaccoon();
        assertNotNull(raccoon);
        assertEquals(DEFAULT_RACCOON_NAME, raccoon.getName());
        assertEquals(DEFAULT_RACCOON_COLOR, raccoon.getColor());
        assertEquals(DEFAULT_RACCOON_SEX, raccoon.getSex());
        assertEquals(DEFAULT_RACCOON_AGE, raccoon.getAge());
    }

    @Test
    public void createRaccoonNotPredefined() {
        Raccoon raccoon = animalService.createRaccoon(RACCOON_NAME, RACCOON_COLOR, RACCOON_SEX, RACCOON_AGE);
        assertNotNull(raccoon);
        assertEquals(RACCOON_NAME, raccoon.getName());
        assertEquals(RACCOON_COLOR, raccoon.getColor());
        assertEquals(RACCOON_SEX, raccoon.getSex());
        assertEquals(RACCOON_AGE, raccoon.getAge());
    }

    @Test
    public void createDomesticCat() {
        DomesticCat domesticCat = animalService.createDomesticCat();
        assertNotNull(domesticCat);
        assertEquals(DEFAULT_CAT_NAME, domesticCat.getName());
        assertEquals(DEFAULT_CAT_COLOR, domesticCat.getColor());
        assertEquals(DEFAULT_CAT_SEX, domesticCat.getSex());
        assertEquals(DEFAULT_CAT_AGE, domesticCat.getAge());
    }

    @Test
    public void createDomesticCatNotPredefined() {
        DomesticCat domesticCat = animalService.createDomesticCat(CAT_NAME, CAT_COLOR, CAT_SEX, CAT_AGE);
        assertNotNull(domesticCat);
        assertEquals(CAT_NAME, domesticCat.getName());
        assertEquals(CAT_COLOR, domesticCat.getColor());
        assertEquals(CAT_SEX, domesticCat.getSex());
        assertEquals(CAT_AGE, domesticCat.getAge());
    }

    @Test
    public void createZwergSchnautzer() {
        ZwergSchnautzer zwergSchnautzer = animalService.createZwergSchnautzer();
        assertNotNull(zwergSchnautzer);
        assertEquals(DEFAULT_DOG_NAME, zwergSchnautzer.getName());
        assertEquals(DEFAULT_DOG_COLOR, zwergSchnautzer.getColor());
        assertEquals(DEFAULT_DOG_SEX, zwergSchnautzer.getSex());
        assertEquals(DEFAULT_DOG_AGE, zwergSchnautzer.getAge());
    }

    @Test
    public void createZwergSchnautzerNotPredefined() {
        ZwergSchnautzer zwergSchnautzer = animalService.createZwergSchnautzer(DOG_NAME, DOG_COLOR, DOG_SEX, DOG_AGE);
        assertNotNull(zwergSchnautzer);
        assertEquals(DOG_NAME, zwergSchnautzer.getName());
        assertEquals(DOG_COLOR, zwergSchnautzer.getColor());
        assertEquals(DOG_SEX, zwergSchnautzer.getSex());
        assertEquals(DOG_AGE, zwergSchnautzer.getAge());
    }
}