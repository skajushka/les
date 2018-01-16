package com.forest.tale;

import com.forest.ConsoleReader;
import com.forest.Forest;
import com.forest.ForestService;
import com.forest.lifeform.animal.AnimalService;
import com.forest.lifeform.plant.PlantService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Story {

    private static String RESOURCE_PATH = "storyTeller/messages.properties";
    private static String ADDING_FOREST = "adding.forest";
    private static String FIRST_VAR = "first.variant";
    private static String SECOND_VAR = "second.variant";
    private Properties messages;
    private ConsoleReader consoleReader;
    private StoryTeller storyTeller;

    public Story() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();

        try (InputStream resourceStream = classLoader.getResourceAsStream(RESOURCE_PATH)) {
            properties.load(resourceStream);
        } catch (IOException e) {
            System.out.println(e);
        }

        this.consoleReader = new ConsoleReader();
        this.storyTeller = new StoryTeller();
        this.messages = properties;
    }

    public void start() {
        if (consoleReader.startJourney()) {
            storyTeller.beginTheStory();
            proceed();
        }
    }

    public void proceed() {
        ForestService forestService = new ForestService(new PlantService(), new AnimalService());
        Forest forest = forestService.createForest();
        System.out.println(forest);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(messages.get(ADDING_FOREST));
        System.out.println(messages.get(FIRST_VAR));
        System.out.println(messages.get(SECOND_VAR));
    }


    public void end() {
        storyTeller.endTheStory();
    }

}
