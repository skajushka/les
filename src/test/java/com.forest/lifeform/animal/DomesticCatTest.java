package com.forest.lifeform.animal;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DomesticCatTest {

    public static String DEFAULT_CAT_NAME = "Blacky";
    public static String DEFAULT_CAT_COLOR = "black";
    public static char DEFAULT_CAT_SEX = 'M';
    public static int DEFAULT_CAT_AGE = 5;
    public static int DEFAULT_CAT_MAX_HUNGER = 3;
    public static String DEFAULT_CAT_SPECIES = "Fellis catus";
    public static char ILLEGAL_SEX_ARG = 'G';
    public static String CAT_VOICE = "Mau-mau-mau!";
    public static int ZERO_HUNGER = 0;
    public static int NEGATIVE_HUNGER = -1;
    public static int POSITIVE_HUNGER = DEFAULT_CAT_MAX_HUNGER + 1;
    public static String SLEEP_MESSAGE = "spak-spak!";
    public static String FED_MESSAGE = "No-No-No! I'm full!";
    public static String HUNGRY_MESSAGE = "No-No-No! I'm empty!";
    public static String HUNGER_REPORT = "my hunger level is";
    public static String POOPOO_REPORT = "Shitting";


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
        Assert.assertEquals(DEFAULT_CAT_MAX_HUNGER/2, domesticCat.getHunger());
    }

    @Test
    public void testCatVoice(){
        domesticCat.voice();
        assertTrue(log.getLog().contains(CAT_VOICE));
    }

    @Test
    public void testSetHunger(){
        domesticCat.setHunger(ZERO_HUNGER);
        assertTrue(log.getLog().contains(SLEEP_MESSAGE));
        domesticCat.setHunger(NEGATIVE_HUNGER);
        assertTrue(log.getLog().contains(FED_MESSAGE));
        domesticCat.setHunger(POSITIVE_HUNGER);
        assertTrue(log.getLog().contains(HUNGRY_MESSAGE));
    }

    @Test
    public void testCheckHunger() {
        domesticCat.checkHunger();
        Assert.assertTrue(log.getLog().contains(HUNGER_REPORT));
    }

    @Test
    public void testPooPoo(){
        int hungerBeforePoo = domesticCat.getHunger();
        domesticCat.pooPoo();
        Assert.assertTrue(log.getLog().contains(POOPOO_REPORT));
        int hungerAfterPoo = domesticCat.getHunger();
        Assert.assertEquals(hungerBeforePoo - 1, hungerAfterPoo);
    }



}
