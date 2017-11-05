package com.forest;

import com.forest.lifeform.LifeForm;
import com.forest.lifeform.animal.Animal;
import com.forest.lifeform.animal.DomesticCat;
import com.forest.lifeform.animal.Racoon;
import com.forest.lifeform.animal.ZwergSchnautzer;
import com.forest.lifeform.plant.Heather;
import com.forest.lifeform.plant.Pine;
import com.forest.lifeform.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class ForestService {

    public Forest createForest() {
        Forest forest = new Forest();
        forest.setBiotope(getInhabitants());
        return forest;
    }

    private List<LifeForm> getInhabitants() {
        Animal pipka = new DomesticCat("Pipka", "tricolor", 'F', 3);
        Animal charka = new ZwergSchnautzer("Charka", "black", 'M', 7);
        Plant pine = new Pine(2, 20);
        Plant heather = new Heather(1,10);
        Racoon inocek = new Racoon("Inocek", "grey", 'F', 3);

        List<LifeForm> inhabitants = new ArrayList<LifeForm>();
        inhabitants.add(pipka);
        inhabitants.add(pine);
        inhabitants.add(charka);
        inhabitants.add(heather);
        inhabitants.add(inocek);
        return inhabitants;
    }
}
