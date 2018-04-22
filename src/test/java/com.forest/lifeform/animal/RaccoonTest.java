package com.forest.lifeform.animal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.forest.lifeform.plant.*;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class RaccoonTest extends AnimalTest {

    public static String DEFAULT_RACCOON_NAME = "Jack";
    public static String DEFAULT_RACCOON_COLOR = "grey";
    public static Sex DEFAULT_RACCOON_SEX = Sex.MALE;
    public static int DEFAULT_RACCOON_AGE = 3;
    public static int DEFAULT_RACCOON_MAX_HUNGER = 4;
    public static String DEFAULT_RACCOON_SPECIES = "Procyon lotor";
    public static int RACCOON_HUNGER_AFTER_FEED = 2;
    public static String RACCOON_VOICE = "Uru-ru-ru!";
    public static String RACCOON_INTRODUCE_TEXT = "I'm Jack-The-Raccoon";

    private Raccoon raccoon;

    @Mock
    private Flower daisyMock;

    @Before
    public void setUp() {
        animal = new Raccoon(DEFAULT_RACCOON_NAME, DEFAULT_RACCOON_COLOR, DEFAULT_RACCOON_SEX, DEFAULT_RACCOON_AGE);
        raccoon = new Raccoon(DEFAULT_RACCOON_NAME, DEFAULT_RACCOON_COLOR, DEFAULT_RACCOON_SEX, DEFAULT_RACCOON_AGE);
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(DEFAULT_RACCOON_MAX_HUNGER, animal.getMaxHunger());
        assertEquals(DEFAULT_RACCOON_SPECIES, animal.getSpecies());
    }

    @Test (expected=IllegalArgumentException.class)
    public void checkSexException() {
        this.animal = new Raccoon(DEFAULT_RACCOON_NAME, DEFAULT_RACCOON_COLOR, ILLEGAL_SEX_ARG, DEFAULT_RACCOON_AGE);
    }

    @Test
    public void checkFieldValues() {
        assertEquals(DEFAULT_RACCOON_NAME, animal.getName());
        assertEquals(DEFAULT_RACCOON_COLOR, animal.getColor());
        assertEquals(DEFAULT_RACCOON_SEX, animal.getSex());
        assertEquals(DEFAULT_RACCOON_AGE, animal.getAge());
        assertEquals(DEFAULT_RACCOON_MAX_HUNGER/2, animal.getHunger());
    }

    @Test
    public void checkFeed() {
        animal.setHunger(animal.getMaxHunger());
        animal.feed(FEED_PORTIONS);
        assertTrue(log.getLog().contains(FEED_REPORT));
        assertEquals(RACCOON_HUNGER_AFTER_FEED, animal.getHunger());
    }

    @Test
    public void testRaccoonVoice(){
        animal.voice();
        assertTrue(log.getLog().contains(RACCOON_VOICE));
    }

    @Test
    public void testIntroduce(){
        animal.introduce();
        assertTrue(log.getLog().contains(RACCOON_INTRODUCE_TEXT));
    }

    @Test
    public void checkMockBouquette() {
        Collection<Flower> mockBouquette = new ArrayList<Flower>();
        mockBouquette.add(daisyMock);
        mockBouquette.add(daisyMock);
        mockBouquette.add(daisyMock);
        mockBouquette.add(daisyMock);
        mockBouquette.add(daisyMock);

        raccoon.setFlowers(mockBouquette);
        assertEquals(raccoon.getFlowers(), mockBouquette);
    }

    @Test
    public void checkPickFlowers() {
        raccoon.pickFlowers();
        Boolean hasBellflowers = Boolean.FALSE;

        for (Flower flower : raccoon.getFlowers()) {
            hasBellflowers = Boolean.TRUE;
        }

        assertTrue(hasBellflowers);
    }
}
