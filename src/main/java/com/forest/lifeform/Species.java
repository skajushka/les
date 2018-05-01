package com.forest.lifeform;

public enum Species {
    SPECIES(null),
        ANIMAL(SPECIES),
            DOG(ANIMAL),
            CAT(ANIMAL),
            RACCOON(ANIMAL),
        PLANT(SPECIES),
            HEATHER(PLANT),
            HAZEL(PLANT),
            RASPBERRY(PLANT),
            DAISY(PLANT),
            BELLFLOWER(PLANT),
            SNOWDROP(PLANT),
            PINE(PLANT),
            OAK(PLANT),
            BIRCH(PLANT);

    private Species parent = null;

    private Species(Species parent) {
        this.parent = parent;
    }
}
