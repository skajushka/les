package com.forest.lifeform.plant;

import com.forest.lifeform.Species;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlantServiceTest {

    private static double DELTA = 0.001;
    private static int DEFAULT_PINE_AGE = 5;
    private static double DEFAULT_PINE_HEIGHT = 70;
    private static Species species;
    private static int DEFAULT_HEATHER_AGE = 1;
    private static double DEFAULT_HEATHER_HEIGHT = 2;
    private static String DEFAULT_FLOWER_COLOR = "blue";
    private static int DEFAULT_DAISY_AGE = 1;
    private static double DEFAULT_DAISY_HEIGHT = 10;
    private static int DEFAULT_BELLFLOWER_AGE = 1;
    private static double DEFAULT_BELLFLOWER_HEIGHT = 10;

    private PlantService plantService;

    @Before
    public void setUp(){
        this.plantService = new PlantService();
    }

    @Test
    public void createPine() {
        Tree tree = plantService.createPine();
        assertNotNull(tree);
        assertEquals(DEFAULT_PINE_AGE, tree.getAge());
        assertEquals(DEFAULT_PINE_HEIGHT, tree.getHeight(), DELTA);
    }

    @Test
    public void createPineNotPredefined() {
        Tree tree = plantService.createPine(DEFAULT_PINE_AGE, DEFAULT_PINE_HEIGHT, Species.PINE);
        assertNotNull(tree);
        assertEquals(DEFAULT_PINE_AGE, tree.getAge());
        assertEquals(DEFAULT_PINE_HEIGHT, tree.getHeight(), DELTA);
    }

    @Test
    public void createHeather() {
        Bush bush = plantService.createHeather();
        assertNotNull(bush);
        assertEquals(DEFAULT_HEATHER_AGE, bush.getAge());
        assertEquals(DEFAULT_HEATHER_HEIGHT, bush.getHeight(), DELTA);
    }

    @Test
    public void createHeatherNotPredefined() {
        Bush bush = plantService.createHeather(DEFAULT_HEATHER_AGE, DEFAULT_HEATHER_HEIGHT, Species.HEATHER);
        assertNotNull(bush);
        assertEquals(DEFAULT_HEATHER_AGE, bush.getAge());
        assertEquals(DEFAULT_HEATHER_HEIGHT, bush.getHeight(), DELTA);
    }

    @Test
    public void createDaisy() {
        Flower daisy = plantService.createFlower(DEFAULT_FLOWER_COLOR, DEFAULT_DAISY_AGE, DEFAULT_DAISY_HEIGHT, Species.DAISY);
        assertNotNull(daisy);
        assertEquals(DEFAULT_FLOWER_COLOR, daisy.getColor());
        assertEquals(DEFAULT_DAISY_AGE, daisy.getAge());
        assertEquals(DEFAULT_DAISY_HEIGHT, daisy.getHeight(), DELTA);
    }

    @Test
    public void createDaisyNotPredefined() {
        Flower daisy = plantService.createFlower(DEFAULT_FLOWER_COLOR, DEFAULT_DAISY_AGE, DEFAULT_DAISY_HEIGHT, Species.DAISY);
        assertNotNull(daisy);
        assertEquals(DEFAULT_FLOWER_COLOR, daisy.getColor());
        assertEquals(DEFAULT_DAISY_AGE, daisy.getAge());
        assertEquals(DEFAULT_DAISY_HEIGHT, daisy.getHeight(), DELTA);
    }

    @Test
    public void createBellflower() {
        Flower bellflower = plantService.createFlower(DEFAULT_FLOWER_COLOR, DEFAULT_DAISY_AGE, DEFAULT_DAISY_HEIGHT, Species.BELLFLOWER);
        assertNotNull(bellflower);
        assertEquals(DEFAULT_FLOWER_COLOR, bellflower.getColor());
        assertEquals(DEFAULT_BELLFLOWER_AGE, bellflower.getAge());
        assertEquals(DEFAULT_BELLFLOWER_HEIGHT,bellflower.getHeight(), DELTA);
    }

    @Test
    public void createBellflowerNotPredefined() {
        Flower bellflower = plantService.createFlower(DEFAULT_FLOWER_COLOR, DEFAULT_DAISY_AGE, DEFAULT_DAISY_HEIGHT, Species.BELLFLOWER);
        assertNotNull(bellflower);
        assertEquals(DEFAULT_FLOWER_COLOR, bellflower.getColor());
        assertEquals(DEFAULT_BELLFLOWER_AGE, bellflower.getAge());
        assertEquals(DEFAULT_BELLFLOWER_HEIGHT,bellflower.getHeight(), DELTA);
    }
}
