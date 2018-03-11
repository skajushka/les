package com.forest.lifeform.animal;

import com.forest.lifeform.plant.Bellflower;
import com.forest.lifeform.plant.Daisy;
import com.forest.lifeform.plant.Flower;

import java.util.ArrayList;
import java.util.Collection;

public class Raccoon extends AnimalImpl {

    private static int MAX_HUNGER = 4;
    private static String SPECIES = "Procyon lotor";

    private Collection<Flower> flowers;

    public Raccoon(String name, String color, Sex sex, int age) {
        super(name, color, sex, age, MAX_HUNGER, SPECIES);
        this.flowers = new ArrayList<Flower>();
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

    public void pickFlowers() {
        Collection<Flower> bouquette = new ArrayList<Flower>();
        int quantityDaisy = (int)(Math.random() * 10);
        int quantityBellflower = (int)(Math.random() * 10);

        for (int i = 0; i <= quantityDaisy; i++) {
            bouquette.add(new Daisy("white", 1, 1));
        }

        for (int i = 0; i <= quantityBellflower; i++) {
            bouquette.add(new Bellflower("blue", 1, 2));
        }

        addFlowers(bouquette);
        System.out.println("Raccoon says: I went to forest and picked " + bouquette.size() + " flowers!");
    }

    public void addFlowers(Collection<Flower> bouquette) {
        this.flowers.addAll(bouquette);
    }
}
