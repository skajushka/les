package com.forest.lifeform.plant;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public abstract class PlantTest {

    private static double DELTA = 0.001;
    public static String DEFAULT_DAISY_COLOR = "white";
    public static int DEFAULT_DAISY_AGE = 1;
    public static double DEFAULT_DAISY_HEIGHT = 10;
    public static double DEFAULT_ENERGY = 2;
    public static double HEIGHT_AFTER_GROW = 11;
    public static String TOSTRING_FIRST_PART = "I'm the ";
    public static String TOSTRING_SECOND_PART = "My color is ";
    public static String TOSTRING_THIRD_PART = "I am ";
    public static String TOSTRING_FORTH_PART = "My height is ";

    protected Plant plant;

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testCheckGrow() {
        plant = new Daisy(DEFAULT_DAISY_COLOR, DEFAULT_DAISY_AGE, DEFAULT_DAISY_HEIGHT);
        plant.grow(DEFAULT_ENERGY);
        assertEquals(HEIGHT_AFTER_GROW, plant.getHeight(), DELTA);
    }

    @Test
    public void testToString(){
        assertTrue(plant.toString().contains(TOSTRING_FIRST_PART));
        assertTrue(plant.toString().contains(TOSTRING_SECOND_PART));
        assertTrue(plant.toString().contains(TOSTRING_THIRD_PART));
        assertTrue(plant.toString().contains(TOSTRING_FORTH_PART));
    }
}
