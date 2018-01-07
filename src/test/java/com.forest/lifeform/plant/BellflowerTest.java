package com.forest.lifeform.plant;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BellflowerTest extends PlantTest {

    public static double DELTA = 0.001;
    public static String DEFAULT_BELLFLOWER_COLOR = "blue";
    public static int DEFAULT_BELLFLOWER_AGE = 1;
    public static double DEFAULT_BELLFLOWER_HEIGHT = 10;
    public static String DEFAULT_BELLFLOWER_SPECIES = "Campanula persicifolia";
    public static String BELLFLOWER_INTRODUCE_MESSAGE = "I'm the Bellflower named Campanula persicifolia";

    @Before
    public void setUp() {
        plant = new Bellflower(DEFAULT_BELLFLOWER_COLOR, DEFAULT_BELLFLOWER_AGE, DEFAULT_BELLFLOWER_HEIGHT);
    }

    @Test
    public void checkDefaultConstructorValues() {
        assertEquals(DEFAULT_BELLFLOWER_SPECIES, plant.getSpecies());
    }

    @Test
    public void checkFieldValues() {
        assertEquals(DEFAULT_BELLFLOWER_COLOR, plant.getColor());
        assertEquals(DEFAULT_BELLFLOWER_AGE, plant.getAge());
        assertEquals(DEFAULT_BELLFLOWER_HEIGHT, plant.getHeight(), DELTA);
    }

    @Test
    public void testIntroduce() {
        plant.introduce();
        assertTrue(log.getLog().contains(BELLFLOWER_INTRODUCE_MESSAGE));
    }
}
