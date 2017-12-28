package com.forest.lifeform.animal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

public abstract class AnimalTest {

    public static Sex ILLEGAL_SEX_ARG = null;
    public static int ZERO_HUNGER = 0;
    public static int NEGATIVE_HUNGER = -1;
    public static String SLEEP_MESSAGE = "spak-spak!";
    public static String FED_MESSAGE = "No-No-No! I'm full!";
    public static String HUNGRY_MESSAGE = "No-No-No! I'm empty!";
    public static String HUNGER_REPORT = "my hunger level is";
    public static String POOPOO_REPORT = "Shitting";
    public static String FEED_REPORT = "Feeding";
    public static String PLAY_REPORT = "plays with ";
    public static int FEED_PORTIONS = 2;
    public static int HUNGER_AFTER_FEED = 1;
    public static int HUNGER_AFTER_PLAY = 2;
    public static String TOSTRING_ONE_PART = "I'm ";
    public static String TOSTRING_SECOND_PART = "My color is ";
    public static String TOSTRING_THIRD_PART = " years old";

    @Mock
    private ZwergSchnautzer zwergSchnautzerMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    protected AnimalImpl animal;

    @Test
    public void testSetZeroHunger(){
        animal.setHunger(ZERO_HUNGER);
        assertTrue(log.getLog().contains(SLEEP_MESSAGE));
    }

    @Test
    public void testNegativeHunger(){
        animal.setHunger(NEGATIVE_HUNGER);
        assertTrue(log.getLog().contains(FED_MESSAGE));
    }

    @Test
    public void testPositiveHunger(){
        animal.setHunger(animal.getMaxHunger() + 1);
        assertTrue(log.getLog().contains(HUNGRY_MESSAGE));
    }

    @Test
    public void testCheckHunger() {
        animal.checkHunger();
        assertTrue(log.getLog().contains(HUNGER_REPORT));
    }

    @Test
    public void testPooPoo(){
        int hungerBeforePoo = animal.getHunger();
        animal.pooPoo();
        assertTrue(log.getLog().contains(POOPOO_REPORT));
        int hungerAfterPoo = animal.getHunger();
        assertEquals(++hungerBeforePoo, hungerAfterPoo);
    }

    @Test
    public void testFeed(){
        animal.setHunger(animal.getMaxHunger());
        animal.feed(FEED_PORTIONS);
        assertTrue(log.getLog().contains(FEED_REPORT));
        assertEquals(HUNGER_AFTER_FEED, animal.getHunger());
    }

    @Test
    public void testPlay() {
        animal.setHunger(HUNGER_AFTER_FEED);
        animal.play(zwergSchnautzerMock);
        assertTrue(log.getLog().contains(PLAY_REPORT));
        assertEquals(HUNGER_AFTER_PLAY, animal.getHunger());
        verify(zwergSchnautzerMock).incrementHunger();
        verify(zwergSchnautzerMock).getName();
    }

    @Test
    public void testToString(){
        assertTrue(animal.toString().contains(TOSTRING_ONE_PART));
        assertTrue(animal.toString().contains(TOSTRING_SECOND_PART));
        assertTrue(animal.toString().contains(TOSTRING_THIRD_PART));
    }
}
