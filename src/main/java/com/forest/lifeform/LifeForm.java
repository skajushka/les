package com.forest.lifeform;


abstract public class LifeForm {
	
	protected int age;
	protected String color;
	protected String species;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public String getSpecies() {
		return this.species;
	}
}
