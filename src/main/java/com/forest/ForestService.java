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

    public ForestService() {
        this.plantService = new PlantService();
        this.animalService = new AnimalService();
    }

    public Forest createForest() {
        Forest forest = new Forest();
        forest.setBiotope(getInhabitants());
        return forest;
    }

    private List<LifeForm> getInhabitants() {
        Plant pine = plantService.createPine();
        Plant heather = plantService.createHeather();
        Raccoon inocek = animalService.createRaccoon();

        List<LifeForm> inhabitants = new ArrayList<LifeForm>();
        inhabitants.add(pine);
        inhabitants.add(heather);
        inhabitants.add(inocek);
        return inhabitants;
    }
}
