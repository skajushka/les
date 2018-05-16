package com.forest.lifeform.animal;

import com.forest.lifeform.Species;

public class Dog extends Animal {

	private static int MAX_HUNGER = 5;
	private static Species species;
	private DogBreed dogBreed;

	public Dog(String name, String color, Sex sex, int age, DogBreed dogBreed) {
		super(name, color, sex, age, MAX_HUNGER, Species.DOG);
		this.dogBreed = dogBreed;
	}
	
	@Override
	public void voice() {
		System.out.println("Hau-hau-hau!");
	}

	@Override
	public void introduce() {
		String result = this.toString() + " and I'm a " + this.dogBreed;
		System.out.println(result);
	}
}
