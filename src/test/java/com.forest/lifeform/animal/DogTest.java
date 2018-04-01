package com.forest.lifeform.animal;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest extends AnimalTest {

    public static String DEFAULT_DOG_NAME = "Rex";
    public static Sex DEFAULT_DOG_SEX = Sex.MALE;
    public static String DEFAULT_DOG_COLOR = "brown";
    public static int DEFAULT_DOG_AGE = 3;
    public static int DEFAULT_DOG_MAX_HUNGER = 5;
    public static String DEFAULT_DOG_SPECIES = "Canis familiaris";
    public static String DOG_VOICE = "Hau-hau-hau!";
    public static String DOG_INTRODUCE_TEXT = "I'm Rex-The-Dog";
    public static int DOG_HUNGER_AFTER_FEED = 3;

    @Before
    public void setUp() {
        animal = new Dog(DEFAULT_DOG_NAME, DEFAULT_DOG_COLOR, DEFAULT_DOG_SEX, DEFAULT_DOG_AGE);
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(DEFAULT_DOG_MAX_HUNGER, animal.getMaxHunger());
        assertEquals(DEFAULT_DOG_SPECIES, animal.getSpecies());
    }

    @Test(expected=IllegalArgumentException.class)
    public void checkSexException(){
        this.animal = new Dog(DEFAULT_DOG_NAME, DEFAULT_DOG_COLOR, ILLEGAL_SEX_ARG, DEFAULT_DOG_AGE);
    }

    @Test
    public void checkFieldValues() {
        assertEquals(DEFAULT_DOG_NAME, animal.getName());
        assertEquals(DEFAULT_DOG_COLOR, animal.getColor());
        assertEquals(DEFAULT_DOG_SEX, animal.getSex());
        assertEquals(DEFAULT_DOG_AGE, animal.getAge());
        assertEquals(DEFAULT_DOG_MAX_HUNGER/2, animal.getHunger());
    }

    @Test
    public void testFeed(){
        animal.setHunger(animal.getMaxHunger());
        animal.feed(FEED_PORTIONS);
        assertTrue(log.getLog().contains(FEED_REPORT));
        assertEquals(DOG_HUNGER_AFTER_FEED, animal.getHunger());
    }

    @Test
    public void testDogVoice(){
        animal.voice();
        assertTrue(log.getLog().contains(DOG_VOICE));
    }

    @Test
    public void testIntroduce(){
        animal.introduce();
        assertTrue(log.getLog().contains(DOG_INTRODUCE_TEXT));
    }

}
