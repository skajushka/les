package com.forest;

import com.forest.lifeform.LifeForm;
import com.forest.lifeform.animal.*;
import com.forest.lifeform.plant.Heather;
import com.forest.lifeform.plant.Pine;
import com.forest.lifeform.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static ForestService forestService = new ForestService();

	public static void main(String[] args) {
		Forest forest = forestService.createForest();
		System.out.println(forest);
	}
}
