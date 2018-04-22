package com.forest.lifeform.animal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest extends AnimalTest {

    public static String DEFAULT_CAT_NAME = "Blacky";
    public static String DEFAULT_CAT_COLOR = "black";
    public static Sex DEFAULT_CAT_SEX = Sex.MALE;
    public static int DEFAULT_CAT_AGE = 5;
    public static int DEFAULT_CAT_MAX_HUNGER = 3;
    public static String DEFAULT_CAT_SPECIES = "Fellis catus";
    public static String CAT_VOICE = "Mau-mau-mau!";
    public static String CAT_INTRODUCE_TEXT = "I'm Blacky-The-Cat";
    public static int CAT_HUNGER_AFTER_FEED = 1;

    @Before
    public void setUp() {
        animal = new Cat(DEFAULT_CAT_NAME, DEFAULT_CAT_COLOR, DEFAULT_CAT_SEX, DEFAULT_CAT_AGE, CatBreed.DOMESTIC_CAT);
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(DEFAULT_CAT_MAX_HUNGER, animal.getMaxHunger());
        assertEquals(DEFAULT_CAT_SPECIES, animal.getSpecies());
    }

    @Test(expected=IllegalArgumentException.class)
    public void checkSexException(){
        this.animal = new Cat(DEFAULT_CAT_NAME, DEFAULT_CAT_COLOR, ILLEGAL_SEX_ARG, DEFAULT_CAT_AGE, CatBreed.DOMESTIC_CAT);
    }

    @Test
    public void checkFieldValues(){
        assertEquals(DEFAULT_CAT_NAME, animal.getName());
        assertEquals(DEFAULT_CAT_COLOR, animal.getColor());
        assertEquals(DEFAULT_CAT_SEX, animal.getSex());
        assertEquals(DEFAULT_CAT_AGE, animal.getAge());
        assertEquals(DEFAULT_CAT_MAX_HUNGER/2, animal.getHunger());
    }

    @Test
    public void testFeed(){
        animal.setHunger(animal.getMaxHunger());
        animal.feed(FEED_PORTIONS);
        assertTrue(log.getLog().contains(FEED_REPORT));
        assertEquals(CAT_HUNGER_AFTER_FEED, animal.getHunger());
    }

    @Test
    public void testCatVoice(){
        animal.voice();
        assertTrue(log.getLog().contains(CAT_VOICE));
    }

    @Test
    public void testIntroduce(){
        animal.introduce();
        assertTrue(log.getLog().contains(CAT_INTRODUCE_TEXT));
    }
}
