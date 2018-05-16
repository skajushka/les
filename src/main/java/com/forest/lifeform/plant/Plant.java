package com.forest.lifeform.plant;

import com.forest.lifeform.LifeForm;
import com.forest.lifeform.Species;

abstract public class Plant extends LifeForm {
	
	protected double height;
	
	public Plant(String color, int age, double height, Species species) {
		this.color = color;
		this.age = age;
		this.height = height;
		this.species = species;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void grow(double energy) {
		double growth = energy / 2;
		double currentHeight = getHeight();
		setHeight(growth + currentHeight);
	}
	
	public void introduce() {
		System.out.println(toString());	
	}

	public String toString() {
		String result = "";
		result += "I'm the " + this.getClass().getSimpleName() + " named " + this.species + "\n";
		result += "My color is " + this.color + "\n";
		result += "I am " + this.age + ((this.age == 1) ? " year" : " years") + " old" + "\n";
		result += "My height is " + this.height + " cm!";		
		return result;
	}
}
