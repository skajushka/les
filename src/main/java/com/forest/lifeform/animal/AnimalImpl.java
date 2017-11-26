package com.forest.lifeform.animal;

import com.forest.lifeform.LifeFormImpl;

abstract public class AnimalImpl extends LifeFormImpl implements Animal {
		
	protected String name;
	protected Sex sex;
	protected int hunger;
	protected int maxHunger;

	public AnimalImpl(String name, String color, Sex sex, int age, int maxHunger, String species) {
		if (sex == null) {
			throw new IllegalArgumentException("No sex defined!");
		}

		this.name = name;
		this.color = color;
		this.age = age;
		this.sex = sex;
		this.hunger = maxHunger / 2;
		this.maxHunger = maxHunger;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		if (sex == null) {
			throw new IllegalArgumentException("No sex defined!");
		} else {
			this.sex = sex;
		}
	}

	public int getMaxHunger(){
		return maxHunger;
	}

	public int getHunger() {
		return this.hunger;
	}
	
	public void setHunger(int hunger) {
		if (hunger >= 0 && hunger <= this.maxHunger) {
			this.hunger = hunger;
			
			if (hunger == 0) {
				this.sleep();
			}
		} else if (hunger < 0) {
			System.out.println(this.name + ": No-No-No! I'm full!");
		} else if (hunger > this.maxHunger) {
			System.out.println(this.name + ": No-No-No! I'm empty!");
		}
	}
	
	public void checkHunger() {
		System.out.println(this.name + ": my hunger level is " + this.hunger);
	}
	
	public void feed(int portions) {
		for (int i = 0; i < portions; i++) {
			feed();	
		}
	}
	
	public void feed() {
		System.out.println("Feeding " + this.name + "...");
		setHunger(this.hunger - 1);
	}
	
	public void incrementHunger() {
		setHunger(++this.hunger);
	}
	
	public void pooPoo() {
		System.out.println("Shitting " + this.name + "...");
		incrementHunger();
	}
	
	public void sleep() {
		System.out.println(this.name + " spak-spak!");
	}
	
	public void play(Animal animal) {
		String message = this.name + "-The-" + this.getClass().getSimpleName() + " plays with " + animal.getName() + "-The-" + animal.getClass().getSimpleName();
		System.out.println(message);
		this.incrementHunger();
		animal.incrementHunger();
	}
	
	abstract public void voice();
	
	public String toString() {
		String result = "";
		result = result + "I'm " + this.name + "-The-" + this.getClass().getSimpleName() + "\n";
		result = result + "I'm a " + this.species + "\n";
		result = result + "My color is " + this.color + "\n";
		result = result + "I am " + this.age + " years old" + "\n";
		
		if (this.sex == Sex.FEMALE) {
			result = result + "I'm a girl";			
		} else if (this.sex == Sex.MALE) {
			result = result + "I'm a boy";
		}

		return result;
	}
	
	public void introduce() {
		System.out.println(toString());	
	}
}