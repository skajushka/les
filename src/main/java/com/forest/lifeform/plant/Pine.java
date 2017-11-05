package com.forest.lifeform.plant;

public class Pine extends PlantImpl {

	private static String COLOR = "green";
	private static String SPECIES = "Pinus silvestris";

	public Pine (int age, double height) {
		super (COLOR, age, height, SPECIES);
	}
}
