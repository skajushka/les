package com.forest.lifeform.plant;

public class Heather extends PlantImpl {

    private static String COLOR = "dark green";
	private static String SPECIES = "Erica vulgaris";
	
	public Heather (int age, double height) {
		super (COLOR, age, height, SPECIES);
	}
}
