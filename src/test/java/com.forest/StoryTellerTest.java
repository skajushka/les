package com.forest;

import com.forest.tale.StoryTeller;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertTrue;

public class StoryTellerTest {

    private StoryTeller storyTeller;

    @Before
    public void setUp() {
        this.storyTeller = new StoryTeller();
    }

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testBeginTheStory() {
        storyTeller.beginTheStory();
        assertTrue(log.getLog().contains("Once upon a time there was a forest."));
    }

    @Test
    public void testEndTheStory() {
        storyTeller.endTheStory();
        assertTrue(log.getLog().contains("Happy end."));
    }
}
