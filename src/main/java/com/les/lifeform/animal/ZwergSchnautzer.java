package com.les.lifeform.animal;

public class ZwergSchnautzer extends AnimalImpl {

	public ZwergSchnautzer(String name, String color, char sex, int age) {
		super(name, color, sex, age, 3, 5, "canis");
	}
	
	@Override
	public void voice() {
		System.out.println("Hau-hau-hau!");
	}
}
