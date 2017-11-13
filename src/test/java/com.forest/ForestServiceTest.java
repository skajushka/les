package com.forest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ForestServiceTest {

    public static int EXPECTED_BIOTOPE_SIZE = 3;
    public static int EXPECTED_FLORA_SIZE = 2;
    public static int EXPECTED_FAUNA_SIZE = 1;

    private ForestService forestService;

    @Before
    public void setUp() {
        this.forestService = new ForestService();
    }

    @Test
    public void createForest() throws Exception {
        Forest forest = forestService.createForest();
        int biotopeSize = forest.getBiotope().size();
        int floraSize = forest.getFlora().size();
        int faunaSize = forest.getFauna().size();
        assertNotNull(forest);
        assertEquals(EXPECTED_BIOTOPE_SIZE, biotopeSize);
        assertEquals(EXPECTED_FLORA_SIZE, floraSize);
        assertEquals(EXPECTED_FAUNA_SIZE, faunaSize);
    }
}
