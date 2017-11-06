package com.forest;

import com.forest.tale.StoryTeller;

public class Main {

	private static ForestService forestService = new ForestService();
    private static StoryTeller storyTeller = new StoryTeller();

	public static void main(String[] args) {
		Forest forest = forestService.createForest();
        storyTeller.beginTheStory();
		System.out.println(forest);
		storyTeller.endTheStory();
	}
}
