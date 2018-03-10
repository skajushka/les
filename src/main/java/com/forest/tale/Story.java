package com.forest.tale;

import com.forest.ConsoleReader;
import com.forest.Forest;
import com.forest.ForestService;
import com.forest.lifeform.animal.AnimalService;
import com.forest.lifeform.animal.DomesticCat;
import com.forest.lifeform.animal.Raccoon;
import com.forest.lifeform.plant.Daisy;
import com.forest.lifeform.plant.PlantService;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Story {

    private static String RESOURCE_PATH = "storyTeller/messages.properties";
    private static String INVALID_ADDING_OPTION = "invalid.adding.option";
    private Properties messages;
    private ConsoleReader consoleReader;
    private StoryTeller storyTeller;
    private Forest forest;
    private AnimalService animalService;
    private PlantService plantService;

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
        this.animalService = new AnimalService();
        this.plantService = new PlantService();
        this.messages = properties;
    }

    public void start() {
        if (consoleReader.startJourney()) {
            storyTeller.beginTheStory();
            ForestService forestService = new ForestService(new PlantService(), new AnimalService());
            this.forest = forestService.createForest();
            System.out.println(this.forest);
            proceed();
        }
    }

    public void proceed() {
        int selectedOption = consoleReader.proceedActions();

        if (selectedOption == 1) {
            DomesticCat cat = animalService.createDomesticCat();
            cat.introduce();
            this.forest.addLifeform(cat);
        } else if (selectedOption == 2) {
            Daisy daisy = plantService.createDaisy();
            daisy.introduce();
            this.forest.addLifeform(daisy);
        } else if (selectedOption == 3) {
            Raccoon inocek = forest.getRaccoon();
            inocek.pickFlowers();
        } else {
            System.out.println(messages.get(INVALID_ADDING_OPTION));
        }

        proceed();
    }

    public void end() {
        storyTeller.endTheStory();
    }
}
