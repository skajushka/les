package com.les.lifeform.animal;

import com.les.lifeform.LifeFormImpl;

abstract public class AnimalImpl extends LifeFormImpl implements Animal {

    private static char FEMALE = 'F';
    private static char MALE = 'M';
		
	protected String name;
	protected char sex;
	protected int hunger;
	protected int maxHunger;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
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
	
	public AnimalImpl(String name, String color, char sex, int age, int maxHunger, String species) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.sex = sex;
		this.hunger = maxHunger / 2;
		this.maxHunger = maxHunger;
		this.species = species;
	}
	
	public String toString() {
		String result = "";
		result = result + "I'm " + this.name + "-The-" + this.getClass().getSimpleName() + "\n";
		result = result + "I'm a " + this.species + "\n";
		result = result + "My color is " + this.color + "\n";
		result = result + "I am " + this.age + " years old" + "\n";
		
		if (this.sex == FEMALE) {
			result = result + "I'm a girl";			
		} else if (this.sex == MALE) {
			result = result + "I'm a boy";
		} else {
			throw new IllegalArgumentException("Incorrect sex!");
		}
		
		return result;
	}
	
	public void introduce() {
		System.out.println(toString());	
	}
}