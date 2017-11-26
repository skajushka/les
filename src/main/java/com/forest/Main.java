package com.forest;

import com.forest.lifeform.animal.AnimalService;
import com.forest.lifeform.plant.PlantService;
import com.forest.tale.StoryTeller;

import java.io.IOException;

public class Main {

    private static ConsoleReader consoleReader = new ConsoleReader();
	private static StoryTeller storyTeller = new StoryTeller();

	public static void main(String[] args) throws IOException {
		if (consoleReader.startJourney()) {
			ForestService forestService = new ForestService(new PlantService(), new AnimalService());
			Forest forest = forestService.createForest();
			storyTeller.beginTheStory();
			System.out.println(forest);
			storyTeller.endTheStory();
		}
	}
}
