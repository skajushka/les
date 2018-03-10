package com.forest;

import com.forest.lifeform.LifeForm;
import com.forest.lifeform.animal.Animal;
import com.forest.lifeform.animal.Raccoon;
import com.forest.lifeform.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<LifeForm> biotope = new ArrayList<LifeForm>();
    private Raccoon raccoon;

    public void setBiotope(List<LifeForm> biotope) {
        this.biotope = biotope;
    }

    public List<LifeForm> getBiotope() {
        return biotope;
    }

    public List<Plant> getFlora() {
        List<Plant> flora = new ArrayList<Plant>();

        for (LifeForm lifeForm : biotope) {
            if (lifeForm instanceof Plant) {
                flora.add((Plant) lifeForm);
            }
        }

        return flora;
    }

    public List<Animal> getFauna() {
        List<Animal> fauna = new ArrayList<Animal>();

        for (LifeForm lifeForm : biotope) {
            if (lifeForm instanceof Animal) {
                fauna.add((Animal) lifeForm);
            }
        }

        return fauna;
    }

    public void addLifeform(LifeForm lifeForm) {
        this.biotope.add(lifeForm);
    }

    public void setRaccoon(Raccoon raccoon) {
        this.raccoon = raccoon;
    }

    public Raccoon getRaccoon() {
        return raccoon;
    }

    public String toString() {
        String result = "";
        result += "There are " + getFauna().size() + " animals and " + getFlora().size() + " plants in the forest." ;
        return result;
    }
}
