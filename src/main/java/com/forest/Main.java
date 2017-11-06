package com.forest;

import com.forest.tale.StoryTeller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	private static ForestService forestService = new ForestService();
    private static StoryTeller storyTeller = new StoryTeller();

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello! Do you want to start a journey?");
		System.out.println("1. Yes!");
		System.out.println("2. No.");

		Integer option = null;

		try {
			option = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Bad choise!");
			option = 0;
		}

		switch (option) {
			case 1:
				Forest forest = forestService.createForest();
				storyTeller.beginTheStory();
				System.out.println(forest);
				storyTeller.endTheStory();
				break;
			case 2:
				System.out.println("Have a nice day!");
				break;
			default:
				System.out.println("That was NOT an option!");
				break;
		}
	}
}
