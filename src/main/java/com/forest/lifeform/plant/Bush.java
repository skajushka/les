package com.forest.lifeform.plant;

import com.forest.lifeform.Species;

public class Bush extends Plant {

    private static String COLOR = "dark green";
    private Species species;

	public Bush(int age, double height, Species species) {
		super (COLOR, age, height, species);
		this.species = species;
	}
}
