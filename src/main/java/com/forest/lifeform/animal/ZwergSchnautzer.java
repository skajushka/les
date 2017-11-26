package com.forest.lifeform.animal;

public class ZwergSchnautzer extends AnimalImpl {

	private static int MAX_HUNGER = 5;
	private static String SPECIES = "Canis familiaris";

	public ZwergSchnautzer(String name, String color, Sex sex, int age) {
		super(name, color, sex, age, MAX_HUNGER, SPECIES);
	}
	
	@Override
	public void voice() {
		System.out.println("Hau-hau-hau!");
	}
}
