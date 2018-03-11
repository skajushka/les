package com.forest.tale;

import com.forest.ConsoleReader;
import com.forest.Forest;
import com.forest.ForestService;
import com.forest.lifeform.animal.*;
import com.forest.lifeform.plant.*;

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
            int selectedAnimal = consoleReader.createAnimal();

            if (selectedAnimal == 1) {
                DomesticCat cat = animalService.createDomesticCat();
                cat.introduce();
                this.forest.addLifeform(cat);
            } else if (selectedAnimal == 2) {
                Dog dog = animalService.createZwergSchnautzer();
                dog.introduce();
                this.forest.addLifeform(dog);
            } else {
                System.out.println(messages.get(INVALID_ADDING_OPTION));
            }

            System.out.println(this.forest);
        } else if (selectedOption == 2) {
            int selectedPlant = consoleReader.createPlant();

            if (selectedPlant == 1) {
                Bellflower bellflower = plantService.createBellflower();
                bellflower.introduce();
                this.forest.addLifeform(bellflower);
            } else if (selectedPlant == 2) {
                Daisy daisy = plantService.createDaisy();
                daisy.introduce();
                this.forest.addLifeform(daisy);
            } else if (selectedPlant == 3) {
                Heather heather = plantService.createHeather();
                heather.introduce();
                this.forest.addLifeform(heather);
            } else if (selectedPlant == 4) {
                Pine pine = plantService.createPine();
                pine.introduce();;
                this.forest.addLifeform(pine);
            } else {
                System.out.println(messages.get(INVALID_ADDING_OPTION));
            }

            System.out.println(this.forest);
        } else if (selectedOption == 3) {
            Raccoon inocek = forest.getRaccoon();
            inocek.pickFlowers();
            System.out.println("Now I have " + inocek.getFlowers().size() + " flowers!");
        } else {
            System.out.println(messages.get(INVALID_ADDING_OPTION));
        }

        proceed();
    }

    public void end() {
        storyTeller.endTheStory();
    }
}
