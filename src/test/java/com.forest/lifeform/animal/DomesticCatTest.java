package com.forest.lifeform.animal;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class DomesticCatTest {

    public static String DEFAULT_CAT_NAME = "Blacky";
    public static String DEFAULT_CAT_COLOR = "black";
    public static Sex DEFAULT_CAT_SEX = Sex.MALE;
    public static int DEFAULT_CAT_AGE = 5;
    public static int DEFAULT_CAT_MAX_HUNGER = 3;
    public static String DEFAULT_CAT_SPECIES = "Fellis catus";
    public static Sex ILLEGAL_SEX_ARG = null;
    public static String CAT_VOICE = "Mau-mau-mau!";
    public static int ZERO_HUNGER = 0;
    public static int NEGATIVE_HUNGER = -1;
    public static int POSITIVE_HUNGER = DEFAULT_CAT_MAX_HUNGER + 1;
    public static String SLEEP_MESSAGE = "spak-spak!";
    public static String FED_MESSAGE = "No-No-No! I'm full!";
    public static String HUNGRY_MESSAGE = "No-No-No! I'm empty!";
    public static String HUNGER_REPORT = "my hunger level is";
    public static String POOPOO_REPORT = "Shitting";
    public static String FEED_REPORT = "Feeding";
    public static String DOG_NAME = "Pups";
    public static String DOG_COLOR = "gray";
    public static Sex DOG_SEX = Sex.MALE;
    public static int DOG_AGE = 7;
    public static String PLAY_REPORT = "plays with ";
    public static int FEED_PORTIONS = 2;
    public static int HUNGER_AFTER_FEED = 1;
    public static int HUNGER_AFTER_PLAY = 2;
    public static String TOSTRING_ONE_PART = "I'm ";
    public static String TOSTRING_SECOND_PART = "My color is ";
    public static String TOSTRING_THIRD_PART = " years old";
    public static String INTRODUCE_TEXT = "I'm Blacky-The-DomesticCat";

    @Mock
    private ZwergSchnautzer zwergSchnautzerMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    private DomesticCat domesticCat;

    @Before
    public void setUp() {
        this.domesticCat = new DomesticCat(DEFAULT_CAT_NAME, DEFAULT_CAT_COLOR, DEFAULT_CAT_SEX, DEFAULT_CAT_AGE);
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(DEFAULT_CAT_MAX_HUNGER, domesticCat.getMaxHunger());
        assertEquals(DEFAULT_CAT_SPECIES, domesticCat.getSpecies());
    }

    @Test(expected=IllegalArgumentException.class)
    public void checkSexException(){
        this.domesticCat = new DomesticCat(DEFAULT_CAT_NAME, DEFAULT_CAT_COLOR, ILLEGAL_SEX_ARG, DEFAULT_CAT_AGE);
    }

    @Test
    public void checkFieldValues(){
        assertEquals(DEFAULT_CAT_NAME, domesticCat.getName());
        assertEquals(DEFAULT_CAT_COLOR, domesticCat.getColor());
        assertEquals(DEFAULT_CAT_SEX, domesticCat.getSex());
        assertEquals(DEFAULT_CAT_AGE, domesticCat.getAge());
        assertEquals(DEFAULT_CAT_MAX_HUNGER/2, domesticCat.getHunger());
    }

    @Test
    public void testCatVoice(){
        domesticCat.voice();
        assertTrue(log.getLog().contains(CAT_VOICE));
    }

    @Test
    public void testSetZeroHunger(){
        domesticCat.setHunger(ZERO_HUNGER);
        assertTrue(log.getLog().contains(SLEEP_MESSAGE));
    }

    @Test
    public void testNegativeHunger(){
        domesticCat.setHunger(NEGATIVE_HUNGER);
        assertTrue(log.getLog().contains(FED_MESSAGE));
    }

    @Test
    public void testPositiveHunger(){
        domesticCat.setHunger(POSITIVE_HUNGER);
        assertTrue(log.getLog().contains(HUNGRY_MESSAGE));
    }

    @Test
    public void testCheckHunger() {
        domesticCat.checkHunger();
        assertTrue(log.getLog().contains(HUNGER_REPORT));
    }

    @Test
    public void testPooPoo(){
        int hungerBeforePoo = domesticCat.getHunger();
        domesticCat.pooPoo();
        assertTrue(log.getLog().contains(POOPOO_REPORT));
        int hungerAfterPoo = domesticCat.getHunger();
        assertEquals(++hungerBeforePoo, hungerAfterPoo);
    }

    @Test
    public void testFeed(){
        domesticCat.setHunger(DEFAULT_CAT_MAX_HUNGER);
        domesticCat.feed(FEED_PORTIONS);
        assertTrue(log.getLog().contains(FEED_REPORT));
        assertEquals(HUNGER_AFTER_FEED, domesticCat.getHunger());
    }

    @Test
    public void testPlay() {
        domesticCat.setHunger(HUNGER_AFTER_FEED);
        domesticCat.play(zwergSchnautzerMock);
        assertTrue(log.getLog().contains(PLAY_REPORT));
        assertEquals(HUNGER_AFTER_PLAY, domesticCat.getHunger());
        verify(zwergSchnautzerMock).incrementHunger();
        verify(zwergSchnautzerMock).getName();
    }

    @Test
    public void testToString(){
        assertTrue(domesticCat.toString().contains(TOSTRING_ONE_PART));
        assertTrue(domesticCat.toString().contains(TOSTRING_SECOND_PART));
        assertTrue(domesticCat.toString().contains(TOSTRING_THIRD_PART));
    }

    @Test
    public void testIntroduce(){
        domesticCat.introduce();
        assertTrue(log.getLog().contains(INTRODUCE_TEXT));
    }
}
