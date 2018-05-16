package com.forest.lifeform.animal;

import com.forest.lifeform.Species;
import com.forest.lifeform.plant.Flower;

import java.util.ArrayList;
import java.util.Collection;

public class Raccoon extends Animal {

    private static int MAX_HUNGER = 4;
    private static Species species;

    private Collection<Flower> flowers;

    public Raccoon(String name, String color, Sex sex, int age) {
        super(name, color, sex, age, MAX_HUNGER, Species.RACCOON);
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
            bouquette.add(new Flower("white", 1, 1, Species.DAISY));
        }

        for (int i = 0; i <= quantityBellflower; i++) {
            bouquette.add(new Flower("blue", 1, 2, Species.BELLFLOWER));
        }

        addFlowers(bouquette);
        System.out.println("Raccoon says: I went to the Forest and picked " + bouquette.size() + " flowers!");
    }

    @Override

    public void introduce() {
        System.out.println(this.toString());
    }

    public void addFlowers(Collection<Flower> bouquette) {
        this.flowers.addAll(bouquette);
    }
}
