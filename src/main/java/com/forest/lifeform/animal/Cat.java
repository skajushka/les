package com.forest.lifeform.animal;

public class Cat extends AnimalImpl {

	private static int MAX_HUNGER = 3;
	private static String SPECIES = "Fellis catus";
	private CatBreed catBreed;

	public Cat(String name, String color, Sex sex, int age, CatBreed catBreed) {
	    super(name, color, sex, age, MAX_HUNGER, SPECIES);
        this.catBreed = catBreed;
	}
	
	@Override
	public void voice () {
		System.out.println ("Mau-mau-mau!");
	}
}
