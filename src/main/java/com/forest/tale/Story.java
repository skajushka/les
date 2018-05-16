package com.forest.tale;

import com.forest.ConsoleReader;
import com.forest.Forest;
import com.forest.ForestService;
import com.forest.ResourceFactory;
import com.forest.lifeform.Species;
import com.forest.lifeform.animal.*;
import com.forest.lifeform.plant.*;

import java.util.Properties;

public class Story {

    private static String RESOURCE_PATH = "storyTeller/messages.properties";
    private static String INVALID_ADDING_OPTION = "invalid.adding.option";
    private Species species;

    private Properties messages;
    private ConsoleReader consoleReader;
    private StoryTeller storyTeller;
    private Forest forest;
    private AnimalService animalService;
    private PlantService plantService;

    public Story() {
        this.messages = ResourceFactory.getResources(Story.RESOURCE_PATH);

        this.consoleReader = new ConsoleReader();
        this.storyTeller = new StoryTeller();
        this.animalService = new AnimalService();
        this.plantService = new PlantService();
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

        switch(selectedOption) {
            case 1:
                createSelectedAnimal();
                System.out.println(this.forest);
                proceed();
                break;
            case 2:
                createSelectedPlant();
                System.out.println(this.forest);
                proceed();
                break;
            case 3:
                Raccoon inocek = forest.getRaccoon();
                inocek.pickFlowers();
                System.out.println("Now I have " + inocek.getFlowers().size() + " flowers!");
                proceed();
                break;
            case 4:
                storyTeller.endTheStory();
                break;
            default:
                System.out.println(messages.get(INVALID_ADDING_OPTION));
                break;
        }
    }

    public void createSelectedAnimal(){
        int selectedAnimal = consoleReader.createAnimal();

        if (selectedAnimal == 1) {
            int selectedBreed = consoleReader.createCatBreed();

            if (selectedBreed == 1) {
                Cat cat = animalService.createCat();
                cat.introduce();
                this.forest.addLifeform(cat);
            } else if (selectedBreed == 2) {
                Cat cat = animalService.createCat();
                cat.introduce();
                this.forest.addLifeform(cat);
            } else {
                System.out.println(messages.get(INVALID_ADDING_OPTION));
            }
        } else if (selectedAnimal == 2) {
            int selectedBreed = consoleReader.createDogBreed();

            if(selectedBreed == 1) {
                Dog dog = animalService.createDog();
                dog.introduce();
                this.forest.addLifeform(dog);
            } else if (selectedBreed == 2) {
                Dog dog = animalService.createDog();
                dog.introduce();
                this.forest.addLifeform(dog);
            } else {
                System.out.println(messages.get(INVALID_ADDING_OPTION));
            }
        } else {
            System.out.println(messages.get(INVALID_ADDING_OPTION));
        }
    }

    public void createSelectedPlant() {
        int selectedPlant = consoleReader.createPlant();
        Plant flower = null;

        switch (selectedPlant) {
            case 1:
                flower = plantService.createFlower("green", 1, 1.3, Species.BELLFLOWER);
                flower.introduce();
                this.forest.addLifeform(flower);
                break;
            case 2:
                flower = plantService.createFlower("green", 1, 1.3, Species.DAISY);
                flower.introduce();
                this.forest.addLifeform(flower);
                break;
            case 3:
                Bush bush = plantService.createHeather();
                bush.introduce();
                this.forest.addLifeform(bush);
                break;
            case 4:
                Tree tree = plantService.createPine();
                tree.introduce();;
                this.forest.addLifeform(tree);
                break;
            default:
                System.out.println(messages.get(INVALID_ADDING_OPTION));
                break;
        }
    }
}
