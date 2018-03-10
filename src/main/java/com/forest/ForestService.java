package com.forest;

import com.forest.lifeform.LifeForm;
import com.forest.lifeform.animal.*;
import com.forest.lifeform.plant.Plant;
import com.forest.lifeform.plant.PlantService;

import java.util.ArrayList;
import java.util.List;

public class ForestService {

    private PlantService plantService;
    private AnimalService animalService;

    public ForestService(PlantService plantService, AnimalService animalService) {
        this.plantService = plantService;
        this.animalService = animalService;
    }

    public Forest createForest() {
        Forest forest = new Forest();
        Raccoon raccoon = animalService.createRaccoon();
        forest.setRaccoon(raccoon);
        forest.setBiotope(createInhabitants());
        return forest;
    }

    private List<LifeForm> createInhabitants() {
        Plant pine = plantService.createPine();
        Plant heather = plantService.createHeather();
        Dog dog = animalService.createZwergSchnautzer();

        List<LifeForm> inhabitants = new ArrayList<LifeForm>();
        inhabitants.add(pine);
        inhabitants.add(heather);
        inhabitants.add(dog);
        return inhabitants;
    }
}
