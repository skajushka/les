package com.forest;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;

public class ConsoleReader {

    private static String RESOURCE_PATH = "consoleReader/messages.properties";
    private static String INIT_QUESTION = "initial.question";
    private static String AGREE = "agree.toProceed";
    private static String DECLINE = "decline.toProceed";
    private static String WRONG_NUMBER = "wrong.number";
    private static String NEGATIVE_ANSWER = "answer.ifNo";
    private static String INVALID_ANSWER = "invalid.answer";
    private static String PROCEED_ACTIONS = "proceed.actions";
    private static String ADD_ANIMAL = "adding.animals";
    private static String ADD_PLANT = "adding.plants";
    private static String COLLECT_FLOWERS = "collecting.flowers";
    private static String ENDING_STORY = "ending.story";
    private static String ADD_CAT = "adding.cat";
    private static String ADD_WILD_CAT = "adding.wildCat";
    private static String ADD_DOMESTIC_CAT = "adding.domesticCat";
    private static String ADD_DOG = "adding.dog";
    private static String ADD_LABRADOR = "adding.labrador";
    private static String ADD_BEAGLE = "adding.beagle";
    private static String ADD_BELLFLOWER = "adding.bellflower";
    private static String ADD_DAISY = "adding.daisy";
    private static String ADD_HEATHER = "adding.bush";
    private static String ADD_PINE = "adding.tree";

    private Properties messages;

    public ConsoleReader() {
        this.messages = ResourceFactory.getResources(ConsoleReader.RESOURCE_PATH);
    }

    public boolean startJourney() {
        System.out.println(messages.get(INIT_QUESTION));
        System.out.println(messages.get(AGREE));
        System.out.println(messages.get(DECLINE));

        switch (readOption()) {
            case 1:
                return true;
            case 2:
                System.out.println(messages.get(NEGATIVE_ANSWER));
                return false;
            default:
                System.out.println(messages.get(INVALID_ANSWER));
                return false;
        }
    }

    public int proceedActions() {
        System.out.println(messages.get(PROCEED_ACTIONS));
        System.out.println(messages.get(ADD_ANIMAL));
        System.out.println(messages.get(ADD_PLANT));
        System.out.println(messages.get(COLLECT_FLOWERS));
        System.out.println(messages.get(ENDING_STORY));

        return readOption();
    }

    public int createAnimal() {
        System.out.println(messages.get(ADD_CAT));
        System.out.println(messages.get(ADD_DOG));

        return readOption();
    }

    public int createCatBreed() {
        System.out.println(messages.get(ADD_WILD_CAT));
        System.out.println(messages.get(ADD_DOMESTIC_CAT));

        return readOption();
    }

    public int createDogBreed() {
        System.out.println(messages.get(ADD_LABRADOR));
        System.out.println(messages.get(ADD_BEAGLE));

        return readOption();
    }

    public int createPlant () {
        System.out.println(messages.get(ADD_BELLFLOWER));
        System.out.println(messages.get(ADD_DAISY));
        System.out.println(messages.get(ADD_HEATHER));
        System.out.println(messages.get(ADD_PINE));

        return readOption();
    }

    private int readOption() {
        BufferedReader reader = BufferedReaderFactory.getInstance();

        Integer option = null;

        try {
            option = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(messages.get(WRONG_NUMBER));
            option = 0;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return option;
    }
}
