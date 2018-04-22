package com.forest.lifeform.plant;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DaisyTest extends PlantTest {

    private static double DELTA = 0.001;
    public static String DEFAULT_DAISY_COLOR = "white";
    public static int DEFAULT_DAISY_AGE = 1;
    public static double DEFAULT_DAISY_HEIGHT = 10;
    public static String DEFAULT_DAISY_SPECIES = "Daisy";
    public static String DAISY_INTRODUCE_MESSAGE = "I'm the Flower named Daisy";
    @Before
    public void setUp() {
        plant = new Flower(DEFAULT_DAISY_COLOR, DEFAULT_DAISY_AGE, DEFAULT_DAISY_HEIGHT, "Daisy");
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(DEFAULT_DAISY_SPECIES, plant.getSpecies());
    }

    @Test
    public void checkFieldValues() {
        assertEquals(DEFAULT_DAISY_COLOR, plant.getColor());
        assertEquals(DEFAULT_DAISY_AGE, plant.getAge());
        assertEquals(DEFAULT_DAISY_HEIGHT, plant.getHeight(), DELTA);
    }

    @Test
    public void testIntroduce() {
        plant.introduce();
        assertTrue(log.getLog().contains(DAISY_INTRODUCE_MESSAGE));
    }
}
