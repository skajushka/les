package com.forest.lifeform.plant;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlantServiceTest {

    private static double DELTA = 0.001;
    private static int DEFAULT_PINE_AGE = 5;
    private static double DEFAULT_PINE_HEIGHT = 70;
    private static int DEFAULT_HEATHER_AGE = 1;
    private static double DEFAULT_HEATHER_HEIGHT = 2;
    private static String DEFAULT_DAISY_COLOR = "white";
    private static int DEFAULT_DAISY_AGE = 1;
    private static double DEFAULT_DAISY_HEIGHT = 10;
    private static String DEFAULT_BELLFLOWER_COLOR = "blue";
    private static int DEFAULT_BELLFLOWER_AGE = 1;
    private static double DEFAULT_BELLFLOWER_HEIGHT = 10;

    private PlantService plantService;

    @Before
    public void setUp(){
        this.plantService = new PlantService();
    }

    @Test
    public void createPine() {
        Pine pine = plantService.createPine();
        assertNotNull(pine);
        assertEquals(DEFAULT_PINE_AGE, pine.getAge());
        assertEquals(DEFAULT_PINE_HEIGHT, pine.getHeight(), DELTA);
    }

    @Test
    public void createPineNotPredefined() {
        Pine pine = plantService.createPine(DEFAULT_PINE_AGE, DEFAULT_PINE_HEIGHT);
        assertNotNull(pine);
        assertEquals(DEFAULT_PINE_AGE, pine.getAge());
        assertEquals(DEFAULT_PINE_HEIGHT, pine.getHeight(), DELTA);
    }

    @Test
    public void createHeather() {
        Heather heather = plantService.createHeather();
        assertNotNull(heather);
        assertEquals(DEFAULT_HEATHER_AGE, heather.getAge());
        assertEquals(DEFAULT_HEATHER_HEIGHT, heather.getHeight(), DELTA);
    }

    @Test
    public void createHeatherNotPredefined() {
        Heather heather = plantService.createHeather(DEFAULT_HEATHER_AGE, DEFAULT_HEATHER_HEIGHT);
        assertNotNull(heather);
        assertEquals(DEFAULT_HEATHER_AGE, heather.getAge());
        assertEquals(DEFAULT_HEATHER_HEIGHT, heather.getHeight(), DELTA);
    }

    @Test
    public void createDaisy() {
        Daisy daisy = plantService.createDaisy();
        assertNotNull(daisy);
        assertEquals(DEFAULT_DAISY_COLOR, daisy.getColor());
        assertEquals(DEFAULT_DAISY_AGE, daisy.getAge());
        assertEquals(DEFAULT_DAISY_HEIGHT, daisy.getHeight(), DELTA);
    }

    @Test
    public void createDaisyNotPredefined() {
        Daisy daisy = plantService.createDaisy(DEFAULT_DAISY_COLOR, DEFAULT_DAISY_AGE, DEFAULT_DAISY_HEIGHT);
        assertNotNull(daisy);
        assertEquals(DEFAULT_DAISY_COLOR, daisy.getColor());
        assertEquals(DEFAULT_DAISY_AGE, daisy.getAge());
        assertEquals(DEFAULT_DAISY_HEIGHT, daisy.getHeight(), DELTA);
    }

    @Test
    public void createBellflower() {
        Bellflower bellflower = plantService.createBellflower();
        assertNotNull(bellflower);
        assertEquals(DEFAULT_BELLFLOWER_COLOR, bellflower.getColor());
        assertEquals(DEFAULT_BELLFLOWER_AGE, bellflower.getAge());
        assertEquals(DEFAULT_BELLFLOWER_HEIGHT,bellflower.getHeight(), DELTA);
    }

    @Test
    public void createBellflowerNotPredefined() {
        Bellflower bellflower = plantService.createBellflower(DEFAULT_BELLFLOWER_COLOR, DEFAULT_BELLFLOWER_AGE, DEFAULT_BELLFLOWER_HEIGHT);
        assertNotNull(bellflower);
        assertEquals(DEFAULT_BELLFLOWER_COLOR, bellflower.getColor());
        assertEquals(DEFAULT_BELLFLOWER_AGE, bellflower.getAge());
        assertEquals(DEFAULT_BELLFLOWER_HEIGHT,bellflower.getHeight(), DELTA);
    }
}
