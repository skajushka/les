package com.les.lifeform.animal;

public class DomesticCat extends AnimalImpl implements Cat {

	public DomesticCat(String name, String color, char sex, int age, String species) {
		super(name, color, sex, age, 2, 3, species);
	}
	
	@Override
	public void voice () {
		System.out.println ("Mau-mau-mau!");
	}
}
