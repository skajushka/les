package com.forest.lifeform.animal;

public enum AnimalBreed {
    ANIMAL_BREED(null),
        DOG_BREED(ANIMAL_BREED),
            BEAGLE(DOG_BREED),
            LABRADOR(DOG_BREED),
        CAT_BREED(ANIMAL_BREED),
            WILD_CAT(CAT_BREED),
            DOMESTIC_CAT(CAT_BREED);

    private AnimalBreed parent = null;

    private AnimalBreed(AnimalBreed parent) {
        this.parent = parent;
    }
}
