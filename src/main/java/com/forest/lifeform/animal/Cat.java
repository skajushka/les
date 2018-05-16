package com.forest.lifeform.animal;

import com.forest.lifeform.Species;

public class Cat extends Animal {

	private static int MAX_HUNGER = 3;
	private static Species species;
	private CatBreed catBreed;

	public Cat(String name, String color, Sex sex, int age, CatBreed catBreed) {
	    super(name, color, sex, age, MAX_HUNGER, Species.CAT);
        this.catBreed = catBreed;
	}
	
	@Override
	public void voice () {
		System.out.println ("Mau-mau-mau!");
	}
}
