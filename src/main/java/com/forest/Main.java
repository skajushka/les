package com.forest;

import com.forest.lifeform.animal.*;
import com.forest.lifeform.plant.Heather;
import com.forest.lifeform.plant.Pine;
import com.forest.lifeform.plant.Plant;

public class Main {

	public static void main(String[] args) {
		Animal pipka = new DomesticCat("Pipka", "tricolor", 'F', 3);
		process(pipka);
		System.out.println();
		Animal charka = new ZwergSchnautzer("Charka", "black", 'M', 7);
		process(charka);
		charka.play(pipka);
		System.out.println();
		Plant pine = new Pine(2, 20);
		process(pine);
		System.out.println();
		Plant heather = new Heather(1,10);
		process(heather);
        System.out.println();
		Racoon inocek = new Racoon("Inocek", "grey", 'F', 3);
		inocek.introduce();
		inocek.pickFlowers();
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
