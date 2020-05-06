package com.forest.lifeform.plant;

import com.forest.lifeform.Species;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BushTest extends PlantTest {

    private static double DELTA = 0.001;
    public static String DEFAULT_HEATHER_COLOR = "dark green";
    public static Species species;
    public static int DEFAULT_HEATHER_AGE = 2;
    public static double DEFAULT_HEATHER_HEIGHT = 30;
    public static String HEATHER_INTRODUCE_MESSAGE = "I'm the Bush named Heather";

    @Before
    public void setUp() {
        plant = new Bush(DEFAULT_HEATHER_AGE, DEFAULT_HEATHER_HEIGHT, Species.HEATHER);
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(Species.HEATHER, plant.getSpecies());
        assertEquals(DEFAULT_HEATHER_COLOR, plant.getColor());
    }

    @Test
    public void checkFieldValues() {
        assertEquals(DEFAULT_HEATHER_AGE, plant.getAge());
        assertEquals(DEFAULT_HEATHER_HEIGHT, plant.getHeight(), DELTA);
    }

/*    @Test
    public void testIntroduce() {
        plant.introduce();
        assertTrue(log.getLog().contains(HEATHER_INTRODUCE_MESSAGE));
    }*/
}
