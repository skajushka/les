package com.forest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ForestServiceTest {

    private ForestService forestService;

    @Before
    public void setUpBeforeTest() {
        this.forestService = new ForestService();
    }

    @Test
    public void createForest() throws Exception {
        Forest forest = forestService.createForest();
        int biotopeSize = forest.getBiotope().size();
        int floraSize = forest.getFlora().size();
        int faunaSize = forest.getFauna().size();
        assertNotNull(forest);
        assertEquals(3, biotopeSize);
        assertEquals(2, floraSize);
        assertEquals(1, faunaSize);
    }
}
