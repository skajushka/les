package com.forest.lifeform.animal;

public class Dog extends Animal {

	private static int MAX_HUNGER = 5;
	private static String SPECIES = "Canis familiaris";
	private DogBreed dogBreed;

	public Dog(String name, String color, Sex sex, int age, DogBreed dogBreed) {
		super(name, color, sex, age, MAX_HUNGER, SPECIES);
		this.dogBreed = dogBreed;
	}
	
	@Override
	public void voice() {
		System.out.println("Hau-hau-hau!");
	}
}
