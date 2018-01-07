package com.forest.tale;

import com.forest.ConsoleReader;
import com.forest.Forest;
import com.forest.ForestService;
import com.forest.lifeform.animal.AnimalService;
import com.forest.lifeform.plant.PlantService;

public class Story {

    private ConsoleReader consoleReader;
    private StoryTeller storyTeller;

    public Story() {
        this.consoleReader = new ConsoleReader();
        this.storyTeller = new StoryTeller();
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
    }

    public void end() {
        storyTeller.endTheStory();
    }

}
