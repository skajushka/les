package com.forest.lifeform.plant;

import com.forest.lifeform.Species;

public class Tree extends Plant {

	private static String COLOR = "green";

	public Tree(int age, double height, Species species) {
		super (COLOR, age, height, species);
	}
}
