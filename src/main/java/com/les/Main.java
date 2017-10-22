package com.les;

import com.les.lifeform.animal.*;
import com.les.lifeform.plant.Heather;
import com.les.lifeform.plant.Pine;
import com.les.lifeform.plant.Plant;

public class Main {

	public static void main(String[] args) {
		Cat pipka = new DomesticCat("Pipka", "tricolor", 'F', 3, "house cat");
		process(pipka);
		System.out.println();
		Dog charka = new ZwergSchnautzer("Charka", "black", 'M', 7);
		process(charka);
		charka.play(pipka);
		System.out.println();
		Plant pine = new Pine(2, 20);
		process(pine);
		System.out.println();
		Plant heather = new Heather(1,10);
		process(heather);
	}
			
	public static void process(Animal animal) {
		animal.introduce();
		animal.voice();
		animal.pooPoo();
		animal.checkHunger();
		animal.feed();
	}
	
	public static void process(Plant plant) {
		plant.introduce();
	}
}
