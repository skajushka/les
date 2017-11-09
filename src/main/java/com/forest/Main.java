package com.forest;

import com.forest.tale.StoryTeller;

import java.io.IOException;

public class Main {

    private static ConsoleReader consoleReader = new ConsoleReader();
	private static ForestService forestService = new ForestService();
	private static StoryTeller storyTeller = new StoryTeller();

	public static void main(String[] args) throws IOException {
		if (consoleReader.startJourney()) {
			Forest forest = forestService.createForest();
			storyTeller.beginTheStory();
			System.out.println(forest);
			storyTeller.endTheStory();
		}
	}
}
