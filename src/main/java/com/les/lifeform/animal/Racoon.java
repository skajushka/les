package com.les.lifeform.animal;

import com.les.lifeform.plant.Bellflower;
import com.les.lifeform.plant.Daisy;
import com.les.lifeform.plant.Flower;

import java.util.ArrayList;
import java.util.Collection;

public class Racoon extends AnimalImpl {

    private static int MAX_HUNGER = 4;
    private static String SPECIES = "Procyon lotor";

    Collection<Flower> flowers;

    public Racoon(String name, String color, char sex, int age) {
        super(name, color, sex, age, MAX_HUNGER, SPECIES);
    }

    public void setFlowers(Collection<Flower> flowers) {
        this.flowers = flowers;
    }

    public Collection<Flower> getFlowers() {
        return flowers;
    }

    @Override
    public void voice() {
        System.out.println("Uru-ru-ru!");
    }

    public void pickFlowers () {
        Collection<Flower> bouquette = new ArrayList<Flower>();
        int quantityDaisy = (int)(Math.random() * 10);
        int quantityBellflower = (int)(Math.random() * 10);

        for (int i = 0; i <= quantityDaisy; i++) {
            bouquette.add(new Daisy("white", 1, 1));
        }

        for (int i = 0; i <= quantityBellflower; i++) {
            bouquette.add(new Bellflower("blue", 1, 2));
        }

        setFlowers(bouquette);
        System.out.println("Racoon says: I went to forest and picked " + bouquette.size() + " flowers!");
    }
}
