package com.forest.tale;

import com.forest.ResourceFactory;

import java.util.Properties;

public class StoryTeller {

    private static String RESOURCE_PATH = "storyTeller/messages.properties";
    private static String BEGIN_STORY = "story.begin";
    private static String END_STORY = "story.end";

    private Properties messages;

    public StoryTeller() {
        this.messages = ResourceFactory.getResources(StoryTeller.RESOURCE_PATH);
    }

    public void beginTheStory() {
        System.out.println(messages.get(BEGIN_STORY));
    }

    public void endTheStory() {
        System.out.println(messages.get(END_STORY));
    }
}
