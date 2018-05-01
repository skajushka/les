package com.forest.lifeform.plant;

import com.forest.lifeform.Species;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeTest extends PlantTest {

    private static double DELTA = 0.001;
    public static String DEFAULT_PINE_COLOR = "green";
    public static Species species;
    public static int DEFAULT_PINE_AGE = 15;
    public static double DEFAULT_PINE_HEIGHT = 75;
    public static String PINE_INTRODUCE_MESSAGE = "I'm the Tree named Pinus silvestris";

    @Before
    public void setUp() {
        plant = new Tree(DEFAULT_PINE_AGE, DEFAULT_PINE_HEIGHT, Species.PINE);
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(Species.PINE, plant.getSpecies());
        assertEquals(DEFAULT_PINE_COLOR, plant.getColor());
    }

    @Test
    public void checkFieldValues() {
        assertEquals(DEFAULT_PINE_AGE, plant.getAge());
        assertEquals(DEFAULT_PINE_HEIGHT, plant.getHeight(), DELTA);
    }

    @Test
    public void testIntroduce() {
        plant.introduce();
        assertTrue(log.getLog().contains(PINE_INTRODUCE_MESSAGE));
    }
}
