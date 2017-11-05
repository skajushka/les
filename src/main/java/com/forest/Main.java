package com.forest;

import com.forest.lifeform.LifeForm;
import com.forest.lifeform.animal.*;
import com.forest.lifeform.plant.Heather;
import com.forest.lifeform.plant.Pine;
import com.forest.lifeform.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Animal pipka = new DomesticCat("Pipka", "tricolor", 'F', 3);
		Animal charka = new ZwergSchnautzer("Charka", "black", 'M', 7);
		Plant pine = new Pine(2, 20);
		Plant heather = new Heather(1,10);
		Racoon inocek = new Racoon("Inocek", "grey", 'F', 3);

		Forest forest = new Forest();
		System.out.println(forest);
		forest.setBiotope(getInhabitants(pipka, pine));
		System.out.println(forest);
		forest.addLifeform(heather);
		System.out.println(forest);
		forest.addLifeform(inocek);
		forest.addLifeform(charka);
		System.out.println(forest);
	}

	public static List<LifeForm> getInhabitants(LifeForm pipka, LifeForm pine){
		List<LifeForm> inhabitants = new ArrayList<LifeForm>();
		inhabitants.add(pipka);
		inhabitants.add(pine);
		return inhabitants;
	}
}
