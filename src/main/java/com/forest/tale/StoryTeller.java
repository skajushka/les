package com.forest.tale;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StoryTeller {

    private static String BEGIN_STORY = "story.begin";
    private static String END_STORY = "story.end";
    private static String RESOURCE_PATH = "storyTeller/messages.properties";

    private Properties messages;

    public StoryTeller() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();

        try(InputStream resourceStream = classloader.getResourceAsStream(RESOURCE_PATH)) {
            properties.load(resourceStream);
        } catch (IOException e) {
            System.out.println(e);
        }

        this.messages = properties;
    }

    public void beginTheStory() {
        System.out.println(messages.get(BEGIN_STORY));
    }

    public void endTheStory() {
        System.out.println(messages.get(END_STORY));
    }
}
