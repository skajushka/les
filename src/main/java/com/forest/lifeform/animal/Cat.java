package com.forest.lifeform.animal;

public class Cat extends AnimalImpl {

	private static int MAX_HUNGER = 3;
	private static String SPECIES = "Fellis catus";

	public Cat(String name, String color, Sex sex, int age) {
		super(name, color, sex, age, MAX_HUNGER, SPECIES);
	}
	
	@Override
	public void voice () {
		System.out.println ("Mau-mau-mau!");
	}
}
