package com.forest.lifeform.plant;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeatherTest extends PlantTest {

    private static double DELTA = 0.001;
    public static String DEFAULT_HEATHER_COLOR = "dark green";
    public static String DEFAULT_HEATHER_SPECIES = "Erica vulgaris";
    public static int DEFAULT_HEATHER_AGE = 2;
    public static double DEFAULT_HEATHER_HEIGHT = 30;
    public static String HEATHER_INTRODUCE_MESSAGE = "I'm the Heather named Erica vulgaris";

    @Before
    public void setUp() {
        plant = new Heather(DEFAULT_HEATHER_AGE, DEFAULT_HEATHER_HEIGHT);
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(DEFAULT_HEATHER_SPECIES, plant.getSpecies());
        assertEquals(DEFAULT_HEATHER_COLOR, plant.getColor());
    }

    @Test
    public void checkFieldValues() {
        assertEquals(DEFAULT_HEATHER_AGE, plant.getAge());
        assertEquals(DEFAULT_HEATHER_HEIGHT, plant.getHeight(), DELTA);
    }

    @Test
    public void testIntroduce() {
        plant.introduce();
        assertTrue(log.getLog().contains(HEATHER_INTRODUCE_MESSAGE));
    }
}
