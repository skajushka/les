package com.forest.lifeform.animal;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalServiceTest {

    private AnimalService animalService;

    @Before
    public void setUp() {
        this.animalService = new AnimalService();
    }

    @Test
    public void createRaccoon() {
        Raccoon raccoon = animalService.createRaccoon();
        String name = raccoon.getName();
        String color = raccoon.getColor();
        char sex = raccoon.getSex();
        int age = raccoon.getAge();
        assertNotNull(raccoon);
        assertEquals("Kroshka", name);
        assertEquals("grey", color);
        assertEquals('F', sex);
        assertEquals(5, age);
    }

    @Test
    public void createDomesticCat() {
        DomesticCat domesticCat = animalService.createDomesticCat();
        String name = domesticCat.getName();
        String color = domesticCat.getColor();
        char sex = domesticCat.getSex();
        int age = domesticCat.getAge();
        assertNotNull(domesticCat);
        assertEquals("Pipka", name);
        assertEquals("tricolor", color);
        assertEquals('F', sex);
        assertEquals(3, age);
    }

    @Test
    public void createZwergSchnautzer() {
        ZwergSchnautzer zwergSchnautzer = animalService.createZwergSchnautzer();
        String name = zwergSchnautzer.getName();
        String color = zwergSchnautzer.getColor();
        char sex = zwergSchnautzer.getSex();
        int age = zwergSchnautzer.getAge();
        assertNotNull(zwergSchnautzer);
        assertEquals("Charka", name);
        assertEquals("black", color);
        assertEquals('M', sex);
        assertEquals(5, age);
    }


}
